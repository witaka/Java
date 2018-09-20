/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string_compare;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class String_Compare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               final String STR_TEST = "ABC";
        System.out.println("Enter string");
        //Scanner obScanner = new Scanner(System.in);
        //String sLine =obScanner.nextLine();
        String sLine="ABC";
        if(sLine == STR_TEST)
        {
            System.out.println("They are");
        }
        else
        {
            System.out.println("They are not");
        }
        
        
        //obScanner.close();
    }
    
}
