/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;


import java.sql.Connection;
import java.sql.Statement;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;


public class JtablePage 
{
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost/Encriptors";
    //  Database credentials
    static final String USER = "MusicLibrary";
    static final String PASS = "abc123";
    
    public static void getTable() throws NoSuchAlgorithmException, InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException 
    {   
        
        Connection con = null; 
        Statement st = null; 
        ResultSet rs = null; 
        String sql;
        try
        { 
          Class.forName(JDBC_DRIVER);
          con =DriverManager.getConnection(DB_URL,USER,PASS);
          st = con.createStatement();
          sql = "SELECT * FROM `users`";
          rs = st.executeQuery(sql); 
          ResultSetMetaData rsmt = rs.getMetaData();
          int c = rsmt.getColumnCount();
          Vector column = new Vector(c);
          for(int i = 1; i <= c; i++) 
          {
              column.add(rsmt.getColumnName(i)); 
          } 
          Vector data = new Vector();
          Vector row = new Vector();
          while(rs.next())
          { 
              row = new Vector(c); 
              for(int i = 1; i <= c; i++)
              {
                  row.add(rs.getString(i));
              } 
              data.add(row); 
          } 
          JFrame frame = new JFrame();
          frame.setSize(500,120);
          frame.setLocationRelativeTo(null);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          JPanel panel = new JPanel();
          JTable table = new JTable(data,column);
          JScrollPane jsp = new JScrollPane(table);
          panel.setLayout(new BorderLayout());
          panel.add(jsp,BorderLayout.CENTER);
          frame.setContentPane(panel);
          frame.setVisible(true);
        }
        catch(Exception e)
        { 
          JOptionPane.showMessageDialog(null, "ERROR"); 
        }
        finally
        { 
            try
            { 
                st.close();
                rs.close();
                con.close();
            }
            catch(Exception e)
            { JOptionPane.showMessageDialog(null, "ERROR CLOSE"); 
            }
        }
    }
}