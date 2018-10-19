
package oop_3encriptors_sql;

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
import windows.JWindow;

public class Main 
{
    

    
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException 
    {   
        XOR xor =  XOR.instance(); 
        Additive additive = Additive.instance();
        String s = xor.encript("1234");
        String v = additive.encript("1234");
        System.out.println(s+"\n"+v);
        AES aes = new AES();
        String dtrVal = aes.encript("hello");
        System.err.println( dtrVal);
        
        
        JWindow window = new JWindow();
        window.setVisible(true);
        
    }
}
