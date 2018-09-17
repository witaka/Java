
package reversepolish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;


public class ReversePolish 
{

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
    
    
    
    public static void main(String[] args) throws IOException
    {
    
        Stack<String> sStack = new Stack();
        boolean bVal = true;
        int nStackNumber = 0;
        while(bVal)
        {
            Scanner oScanner = new Scanner(System.in);
            String sLine =oScanner.nextLine();
           
                if(ifNumber(sLine) & nStackNumber<=2)
                {
                    sStack.push(sLine);
                    nStackNumber++;
                }
                else if(nStackNumber<=2) 
                {
                    if(ifNumber(sStack.peek()))
                    {
                        int iVal_1 = Integer.parseInt(sStack.pop());
                        int iVal_2 = Integer.parseInt(sStack.pop());

                        char cLine = sLine.charAt(0);
                               switch(cLine)
                               {
                                     case 42: sStack.push(String.valueOf(iVal_2*iVal_1)); 
                                                  break;
                                     case 43: sStack.push(String.valueOf(iVal_2+iVal_1));
                                                  break;
                                     case 45: sStack.push(String.valueOf(iVal_2-iVal_1)); 
                                                  break;
                                     case 47: sStack.push(String.valueOf(iVal_2/iVal_1)); 
                                                  break; 
                                     default:  sStack.push(String.valueOf(iVal_2)); 
                                                  break;
                                }
                        System.out.println( sStack.peek());
                        nStackNumber=1;
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
