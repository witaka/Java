
package stringcompare;

import java.io.IOException;
import java.util.Scanner;


public class StringCompare 
{

    static void main(String[] args) throws IOException
    {
        final String STR_TEST = "ABC";
        System.out.println("Enter string");
        Scanner obScanner = new Scanner(System.in);
        String sLine =obScanner.nextLine();
        if(sLine.equals( STR_TEST))
        {
            System.out.println("They are");
        }
        else
        {
            System.out.println("They are not");
        }
        
        
        obScanner.close();
    }
    
}
