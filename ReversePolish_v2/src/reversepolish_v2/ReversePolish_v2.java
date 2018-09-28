/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversepolish_v2;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author root
 */
public class ReversePolish_v2 {

       public static boolean ifNumber (String sVal) 
    {  
        try
        {  
          int iNuber=Integer.parseInt(sVal);  
        }  
        catch(NumberFormatException nfe){  
          return false;  
        }  
        return true;  
     }
       
       
    public static void main(String[] args) 
        {
        Stack<String> sStack = new Stack();
        boolean bVal = true;
        int nStackNumber = 0;
        while(bVal)
        {
            Scanner oScanner = new Scanner(System.in);
            String sLine =oScanner.nextLine();
         
                if(ifNumber(sLine) & nStackNumber<2)
                {
                    sStack.push(sLine);
                    nStackNumber++;
                }
                else if(nStackNumber==2) 
                {
                    int iVal_2 = Integer.parseInt(sStack.pop());
                    int iVal_1 = Integer.parseInt(sStack.pop());
                    char cLine = sLine.charAt(0);
                               switch(cLine)
                               {
                                     case 42: sStack.push(String.valueOf(iVal_1*iVal_2)); 
                                                  break;
                                     case 43: sStack.push(String.valueOf(iVal_1+iVal_2));
                                                  break;
                                     case 45: sStack.push(String.valueOf(iVal_1-iVal_2)); 
                                                  break;
                                     case 47: sStack.push(String.valueOf(iVal_1/iVal_2)); 
                                                  break; 
                                     default:  sStack.push(String.valueOf(iVal_1)); 
                                                  break;
                                }
                    
                    System.out.println("2"+sStack.peek());
                    nStackNumber=1;
                }
                else if(sLine.equals("yes") | sLine.equals("Yes") | sLine.equals("YES"))
                {
                    bVal = false;
                }
                else 
                {
                       if(sStack.empty()== false)
                    {
                        System.out.println(sStack.peek());
                    }
                    else
                    {
                        System.err.println("Vrong input");
                    }
       
                }
                
               
        }
        
    }

  
    
   
    
}
