/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systenio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author root
 */
public class SystenIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        BufferedReader obReader = new BufferedReader(new InputStreamReader(System.in));
        String sV1 = obReader.readLine();
        int iV1= Integer.parseInt(sV1);
        
        BufferedReader obReader2 = new BufferedReader(new InputStreamReader(System.in));
        String sV2  = obReader.readLine();
        int iV2= Integer.parseInt(sV2);
        
        System.out.println(iV1+iV2);
        // TODO code application logic here
        
       Scanner oSc = new Scanner(System.in);
       int iC1 = oSc.nextInt();
       int iC2 = oSc.nextInt();
       
        System.out.println(iC1+iC2);
        
       
       
        
        
    }
    
}
