/*
 * JDBC Assignment
 *
 * Author: Ed Mahon
 * History:
 *  Mar. 12, 2015 - Ed Mahon
 *      Creation.
 * ---------------------------------------------------------------------------*
 * Setup:
 *  1. Using phpmyadmin, create a new USER with the credentials:
 *        User: MusicLibrary
 *        Password: abc123
 *
 *     IMPORTANT: Select the option to create a database with the same name
 *                and grant the user full privileges.
 *  2. Create a new Java Application project called MusicLibrary.
 *  3. Copy the contents of this file into the main project class by the same
 *     name.
 *  4. Add the mysql JAR file library reference in the project's Properties.
 *
 * Background:
 *  1. The main algorithm involves the following steps:
 *      a) database table creation.
 *      b) population of the compact disc table with test data.
 *      c) population of the genre table with normalized data from the compact
 *         disc table (compact_disc_genre column).
 *      d) updating of the compact disc table's genre_id with the genre table's
 *         corresponding primary key.
 *      e) deletion of the compact disc table's compact_disc_genre column.
 *      f) displaying of the data and metrics
 *  2. The code correctly creates/recreates all required tables and columns.
 *  3. Upon completion:
 *      a) the compact disc table's genre_id column should contain the foreign key
 *         for the normalized genre table's data.
 *      b) the compact disc table's compact_disc_genre column should be deleted.
 *
 * Tasks:
 *  1. Correct the code syntax errors.
 *  2. Step through the code to understand the algorithm and find:
 *      a) redundancy or inefficiency
 *      b) logic errors
 *  3. Complete the displayCdCollection() method and its dependent methods.
 *  4. Complete the runTestCase() method to profile the execution time.
 *
 *  Note: Search this file for "Task #3" and "Task #4" to find applicable areas.
 */
package musiclibrary;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author user
 */
public class Example {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/MusicLibrary";

    // Database credentials
    static final String USER = "MusicLibrary";
    static final String PASS = "abc123";

    // Database tables/columns
    // Compact Disc Table
    static final String COMPACT_DISC_TABLE = "compact_disc";
    static final String COMPACT_DISC_ID_COLUMN = "compact_disc_id";
    static final String COMPACT_DISC_TITLE_COLUMN = "compact_disc_title";
    static final String COMPACT_DISC_GENRE_COLUMN = "compact_disc_genre";
    // Genre Table
    static final String GENRE_TABLE = "genre";
    static final String GENRE_ID_COLUMN = "genre_id";
    static final String GENRE_DESCRIPTION_COLUMN = "genre_description";

    // Miscellaneous
    static final int TEST_DATA_ROWS_PER_GENRE = 10;

    // Static/Class member variables
    private static Connection sm_dbConnection = null;

    /*------------------------------------------------------------------------*\
     * Inserts a specified number of rows into the compact disc table for the
     * specified genre.  The CD title is automatically generated.
     \*------------------------------------------------------------------------*/
    private static void insertCdDataForGenre(String strGenre, int iRows) throws SQLException {
        String strTitle = "";
        String strColumns = "(" + COMPACT_DISC_TITLE_COLUMN + ", " + COMPACT_DISC_GENRE_COLUMN + ")";
        String strValues = "";
        String strSql = "";

        for (int i = 0; i < iRows; ++i) {
            strTitle = strGenre + "_AutomatedTitle_" + i;
            strValues = "VALUES('" + strTitle + "', '" + strGenre + "')";
            strSql = "INSERT INTO " + COMPACT_DISC_TABLE + " " + strColumns + " " + strValues;

            try {
                Statement stmt = sm_dbConnection.createStatement();
                stmt.executeUpdate(strSql);
            } catch (SQLException ex) {
                System.out.println("insertCdDataForGenre - " + ex.toString());
                throw ex;
            }

            //System.out.println("#" + i + ": " + strTitle);
        }
    }

    /*------------------------------------------------------------------------*\
     * Retrieves the list of genres from the compact_disc table's
     * compact_disc_genre column.
     *
     * Note: See the SQL language 'DISTINCT' qualifier on the 'SELECT' statement.
     \*------------------------------------------------------------------------*/
    private static ArrayList<String> getDistinctCompactDiscGenres() throws SQLException {
        ArrayList<String> arrStrGenres = new ArrayList<String>();
        Statement stmt = sm_dbConnection.createStatement();
        // Get a single instance of each genre string from all the compact_disc_genre rows
        String strSql = "SELECT DISTINCT " + COMPACT_DISC_GENRE_COLUMN + " FROM " + COMPACT_DISC_TABLE;

        ResultSet rs = stmt.executeQuery(strSql);

        while (rs.next()) {
            arrStrGenres.add(rs.getString(COMPACT_DISC_GENRE_COLUMN));
        }

        return arrStrGenres;
    }

    /*------------------------------------------------------------------------*\
     * Inserts the provided genre into the genre table and returns the newly
     * created row's id/primary key.
     \*------------------------------------------------------------------------*/
    private static int insertGenre(String strGenre) throws SQLException {
        String strColumns = "(" + GENRE_DESCRIPTION_COLUMN + ")";
        String strValues = "VALUES('" + strGenre + "')";
        String strSql = "INSERT INTO " + GENRE_TABLE + " " + strColumns + " " + strValues;
        int iPkId = 0;  // 0 is an invalid database identity key

        try {
            Statement stmtInsert = sm_dbConnection.createStatement();

            // Insert the new value into the genre table and save the auto-increment genrated keys for later retrieval
            stmtInsert.execute(strSql, Statement.RETURN_GENERATED_KEYS);

            ResultSet rsGeneratedKeys = stmtInsert.getGeneratedKeys();

            if (rsGeneratedKeys.next()) {
                iPkId = rsGeneratedKeys.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println("insertGenre - " + ex.toString());
            throw ex;
        }

        return iPkId;
    }

    /*------------------------------------------------------------------------*\
     *
     \*------------------------------------------------------------------------*/
    private static void updateCompactDiscGenreId(String strGenre, int iGenreId) throws SQLException {
        String strSet = "SET " + GENRE_ID_COLUMN + "=" + iGenreId;
        String strWhere = "WHERE " + COMPACT_DISC_GENRE_COLUMN + "='" + strGenre + "'";
        String strSql = "UPDATE " + COMPACT_DISC_TABLE + " " + strSet + " " + strWhere;

        try {
            Statement stmtUpdate = sm_dbConnection.createStatement();

            stmtUpdate.executeUpdate(strSql);
        } catch (SQLException ex) {
            System.out.println("updateCompactDiscGenreIds - " + ex.toString());
            throw ex;
        }
    }
    /*------------------------------------------------------------------------*\
     * This method inserts a row into the genre table for every unique genre
     * detected in the compact disc table's compact_disc_genre columns.  It then
     * updates the compact disc table's genre_id rows with the prmary/foreign
     * key of the newly inserted genre table value.
     \*------------------------------------------------------------------------*/

    private static void normalizeCompactDiscGenres() throws SQLException {
        try {
            // Get the unique genre strings from the compact disc table
            ArrayList<String> arrGenres = getDistinctCompactDiscGenres();
            Iterator<String> iterGenres = arrGenres.iterator();

            // Iterate over all of them
            while (iterGenres.hasNext()) {
                String strGenre = iterGenres.next();

                // Insert the genre in the genre table and sae the primary key
                int iGenreId = insertGenre(strGenre);

                if (iGenreId > 0) // 0 is not a valid database primary key
                {
                    updateCompactDiscGenreId(strGenre, iGenreId);
                }
            }
        } catch (SQLException ex) {
            System.out.println("normalizeCompactDiscGenres - " + ex.toString());
            throw ex;
        }
    }

    /*------------------------------------------------------------------------*\
     * This method inserts the test data for the various genres.
     \*------------------------------------------------------------------------*/
    private static void populateDatabase(int iGenreCount, int iRowCountPerGenre) throws SQLException {
        while (0 < iGenreCount--) {
            insertCdDataForGenre("Genre_" + iGenreCount, iRowCountPerGenre);
        }
    }

    /*------------------------------------------------------------------------*\
     * This method truncates the specified tables.
     \*------------------------------------------------------------------------*/
    private static void truncateTable(String strTable) {
        try {
            String strSql = "TRUNCATE " + strTable;
            Statement stmt = sm_dbConnection.createStatement();
            stmt.executeUpdate(strSql);
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("truncateTable - " + ex.toString());
            // Note: Don't re-throw the exception - non-existant tables are not show-stoppers
        }
    }

    /*------------------------------------------------------------------------*\
     * This method resets/truncates the database tables.
     \*------------------------------------------------------------------------*/
    private static void resetData() {
        truncateTable(COMPACT_DISC_TABLE);
        truncateTable(GENRE_TABLE);
    }

    /*------------------------------------------------------------------------*\
     * This method deletest the obsolete COMPACT_DISC_GENRE_COLUMN from the table.
     \*------------------------------------------------------------------------*/
    private static void deleteNormalizedCompactDiscColumns() throws SQLException {
        String strSql = "ALTER TABLE `" + COMPACT_DISC_TABLE + "` DROP `" + COMPACT_DISC_GENRE_COLUMN + "`";
        Statement stmt = sm_dbConnection.createStatement();

        stmt.execute(strSql);
    }
    /*------------------------------------------------------------------------*\
     * This method deletes and recreates the database tables.
     \*------------------------------------------------------------------------*/

    private static void createDatabaseTables() throws SQLException {
        String strSql = "";
        Statement stmt = sm_dbConnection.createStatement();

        // Ensure re-creation by deleting the tables, if they exist already
        try {
            strSql = "DROP TABLE `" + COMPACT_DISC_TABLE + "`";
            stmt.execute(strSql);
        } catch (SQLException ex) { /* Do nothing - valid for non-existent table */ }

        try {
            strSql = "DROP TABLE `" + GENRE_TABLE + "`";
            stmt.execute(strSql);
        } catch (SQLException ex) { /* Do nothing - valid for non-existent table */ }

        // Table Creation
        /*------------------- Compact Disc --------------------*/
        strSql = "CREATE TABLE IF NOT EXISTS `" + COMPACT_DISC_TABLE + "` ("
                + "`" + COMPACT_DISC_ID_COLUMN + "` int(11) NOT NULL,"
                + "`" + COMPACT_DISC_TITLE_COLUMN + "` varchar(80) NOT NULL,"
                + "`" + COMPACT_DISC_GENRE_COLUMN + "` varchar(50) NOT NULL,"
                + "`" + GENRE_ID_COLUMN + "` int(11) NOT NULL DEFAULT '0'"
                + ") ENGINE=InnoDB DEFAULT CHARSET=latin1";
        stmt.execute(strSql);
        // And add the primary key and foriegn key indices
        strSql = "ALTER TABLE `" + COMPACT_DISC_TABLE + "` "
                + "ADD PRIMARY KEY (`" + COMPACT_DISC_ID_COLUMN + "`),"
                + "ADD KEY `" + GENRE_ID_COLUMN + "` (`" + GENRE_ID_COLUMN + "`)";
        stmt.execute(strSql);
        // Set the primary key's auto-increment
        strSql = "ALTER TABLE `" + COMPACT_DISC_TABLE + "` "
                + "MODIFY `" + COMPACT_DISC_ID_COLUMN + "` int(11) NOT NULL AUTO_INCREMENT";
        stmt.execute(strSql);

        /*------------------- Genre --------------------*/
        strSql = "CREATE TABLE IF NOT EXISTS `" + GENRE_TABLE + "` ("
                + "`" + GENRE_ID_COLUMN + "` int(11) NOT NULL,"
                + "`" + GENRE_DESCRIPTION_COLUMN + "` varchar(50) NOT NULL"
                + ") ENGINE=InnoDB DEFAULT CHARSET=latin1";
        stmt.execute(strSql);

        strSql = "ALTER TABLE `" + GENRE_TABLE + "` "
                + "ADD PRIMARY KEY (`" + GENRE_ID_COLUMN + "`)";
        stmt.execute(strSql);

        strSql = "ALTER TABLE `" + GENRE_TABLE + "` "
                + "MODIFY `" + GENRE_ID_COLUMN + "` int(11) NOT NULL AUTO_INCREMENT";
        stmt.execute(strSql);

        resetData();
    }

    /*------------------------------------------------------------------------*\
     * This method initializes the shared JDBC connection.
     \*------------------------------------------------------------------------*/
    private static boolean connectToDatabase() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            try {
                sm_dbConnection = DriverManager.getConnection(DB_URL, USER, PASS);

            } catch (SQLException ex) {
                System.out.println("connectToDatabase - " + ex.toString());
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("connectToDatabase - " + ex.toString());
        }

        return (null != sm_dbConnection);
    }

    /*------------------------------------------------------------------------*\
     * Application entry point.
     \*------------------------------------------------------------------------*/
    public static void main(String[] args) {
        try {
            if (connectToDatabase()) {

                runTestCase(10, TEST_DATA_ROWS_PER_GENRE);      // 100
                //runTestCase(100, TEST_DATA_ROWS_PER_GENRE);     // 1,000
                //runTestCase(1000, TEST_DATA_ROWS_PER_GENRE);    // 10,000
                //runTestCase(10000, TEST_DATA_ROWS_PER_GENRE);   // 100,000
                //runTestCase(100000, TEST_DATA_ROWS_PER_GENRE);  // 1,000,000
                //runTestCase(1000000, TEST_DATA_ROWS_PER_GENRE); // 10,000,000
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    /*------------------------------------------------------------------------*\
     * Task #3
     * Task #4
     * This method runs a full test of population, normalization, cleanup, and
     * display for the specified number of genres, each having the specified
     * number of CDs.
     \*------------------------------------------------------------------------*/
    private static void runTestCase(int iGenreCount, int iCdCountPerGenre) throws SQLException {
        System.out.println("_____________________________________________________________________________________________");
        System.out.println("*** Running test case for " + iGenreCount + " genres, each containing " + iCdCountPerGenre + " CDs (" + (iGenreCount * iCdCountPerGenre) + " total) ***\n");
        // ToDo - write the code to time the execution of this test case.
        createDatabaseTables();
        populateDatabase(iGenreCount, iCdCountPerGenre);
        normalizeCompactDiscGenres();
        deleteNormalizedCompactDiscColumns();
        // Task #3: Complete the coding/methods to complete the following call.
        displayCdCollection();
    }
    /*------------------------------------------------------------------------*\
     * Task #3
     * This method displays the CD count and CD data rows for all genres.
     \*------------------------------------------------------------------------*/

    private static void displayCdCollection() throws SQLException {
        Statement stmt = sm_dbConnection.createStatement();

        // ToDo - write the code/SQL to determine the total number of genres and
        //        CDs in the database
        String strCount = "SELECT  (\n"
                + "        SELECT COUNT(compact_disc.compact_disc_id)\n"
                + "FROM compact_disc\n"
                + "        ) AS iCdCount,\n"
                + "        (\n"
                + "        SELECT COUNT(genre.genre_id)\n"
                + "FROM genre\n"
                + "        ) AS iGenreCount\n"
                + "FROM    dual";

        ResultSet rs = stmt.executeQuery(strCount);

        int iGenreCount = 0;
        int iCdCount = 0;

        while (rs.next()) {
            iGenreCount = Integer.parseInt(rs.getString("iCdCount"));
            iCdCount = Integer.parseInt(rs.getString("iGenreCount"));
        }

        System.out.println("Genres: " + iGenreCount + " CDs: " + iCdCount);

        // ToDo - write code to loop over all genres (ORDERED ALPHABETICALLY)
        //        and set strGenre
        String strGenre = "SELECT\n"
                + "  `genre_id`,\n"
                + "  `genre_description`\n"
                + "FROM\n"
                + "  genre\n"
                + "ORDER BY\n"
                + "  genre.genre_description";

        ResultSet rsGenre = stmt.executeQuery(strGenre);

        while (rsGenre.next()) {
            strGenre = rsGenre.getString(GENRE_DESCRIPTION_COLUMN);

            displayGenreCdCount(strGenre);
            displayGenreCdDetails(strGenre);
        }
    }

    /*------------------------------------------------------------------------*\
     * Task #3
     * This method displays the CD count for the specified genre.
     \*------------------------------------------------------------------------*/
    private static void displayGenreCdCount(String strGenre) throws SQLException {
        // ToDo - write code/SQL to determine/set iCount for specified genre
        String strSql = "SELECT COUNT(a.compact_disc_id) as iCount\n"
                + "FROM\n"
                + "  compact_disc a\n"
                + "INNER JOIN\n"
                + "  genre b ON a.genre_id = b.genre_id AND b.genre_description = '" + strGenre + "'";
        Statement stmt = sm_dbConnection.createStatement();
        ResultSet rs = stmt.executeQuery(strSql);

        int iCount = 0;
        while (rs.next()) {
            iCount = Integer.parseInt(rs.getString("iCount"));
        }

        // Sanity test
        if (iCount == TEST_DATA_ROWS_PER_GENRE) {
            System.out.println("Genre: " + strGenre + " (" + iCount + ")");
        } else {
            System.out.println("displayCdCount ERROR: Whoa, Spanky!  CD counts don't match (" + TEST_DATA_ROWS_PER_GENRE + " expected, " + iCount + " calculated)...");
        }
    }

    /*------------------------------------------------------------------------*\
     * Task #3
     * This method displays the CDs and details for the specified genre.
     \*------------------------------------------------------------------------*/
    private static void displayGenreCdDetails(String strGenre) throws SQLException {
        int iCounter = 1;
        // #1 ToDo - write code/SQL statement to JOIN the compact disc and genre 
        //           tables for a ResultSet containing fields (google SQL 'JOIN').
        String strSql = "SELECT\n"
                + "  *\n"
                + "FROM\n"
                + "  compact_disc a\n"
                + "INNER JOIN\n"
                + "  genre b ON a.genre_id = b.genre_id\n"
                + "ORDER BY\n"
                + "  b.genre_description;";

        // #2 ToDo - Uncomment/debug/complete
        Statement stmt = sm_dbConnection.createStatement();
        ResultSet rs = stmt.executeQuery(strSql);

        while (rs.next()) {
            if(strGenre.equals(rs.getString(GENRE_DESCRIPTION_COLUMN)) ){
            System.out.print("#" + iCounter + ": " + rs.getString(COMPACT_DISC_TITLE_COLUMN));
            System.out.println(" (" + rs.getString(GENRE_DESCRIPTION_COLUMN) + ")");
            iCounter++;
            }
        }

    }
}
