/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3_encriptor_oop;

import java.util.Scanner;


public class Main 
{

    public static void main(String[] args)
    {
        boolean bFlag =true;
        while(bFlag)
        {
            Scanner obScanner = new Scanner(System.in);
            System.out.println("Enter String line");
            String sVal = obScanner.nextLine();
            if(sVal.equals("exit"))
            {
                bFlag = false;
            }
            else
            {
                System.out.println("Select encryption method");
                System.out.println("1: Additive");
                System.out.println("2: Bitwise Inversion");
                System.out.println("3: XOR");
                String sTipeEncriptor =obScanner.nextLine(); 
                Encriptors newEncr = EncriptorsFactory.makeEncripor(sTipeEncriptor);  
                String sEncriptVAl = newEncr.encript(sVal);
                newEncr.setSecuritylevel(sVal,sEncriptVAl);
                System.out.println("Encripted line: "+ newEncr.encript(sVal));
                String sDecriptVAl = newEncr.decrypt(sEncriptVAl);
                System.out.println("Decripted line: "+sDecriptVAl);
                System.out.println(newEncr.getSecuritylevel());
            }
        }
        
    }
    
}
