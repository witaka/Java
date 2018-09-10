/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagramtester;

import static java.awt.SystemColor.text;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.lang.StringBuffer;
import java.lang.StringBuilder;


/**
 *
 * @author root
 */
public class AnagramTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        StringBuffer sbuffer = new StringBuffer();
        sbuffer.append(JOptionPane.showInputDialog("Enter text"));
        String sLine_original = sbuffer.toString();
        String sLine_reverse =  sbuffer.reverse().toString();
        JOptionPane.showMessageDialog(null,sLine_original+sLine_reverse,"New Text",JOptionPane.PLAIN_MESSAGE);
       
        
        
        /*StringBuffer sbuffer = new StringBuffer();;
        Scanner obScanner = new Scanner(System.in);
        System.out.println("Enter a string");
        sbuffer.append(obScanner.nextLine());
        String sLine_original = sbuffer.toString();
        String sLine_reverse =  sbuffer.reverse().toString();

        System.out.println(sLine_original+sLine_reverse);*/
        
        
        /*StringBuilder obSbuilder = new StringBuilder();
        Scanner obScanner = new Scanner(System.in);
        System.out.println("Enter a string");
        obSbuilder.append(obScanner.nextLine());
        String sLine_original = obSbuilder .toString();
        String sLine_reverse =  obSbuilder .reverse().toString();

        System.out.println(sLine_original+sLine_reverse);*/
        
    }
    
}


