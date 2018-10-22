
package encriptor;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;


public class Encriptor {

    private static void encrypt(String sData) throws UnsupportedEncodingException
    {
       
        char cLine[] = sData.toCharArray(); 
        
        byte bLine[] = sData.getBytes("US-ASCII"); 
        for(int i=0;i<=bLine.length;i++)
        {
            System.out.print(bLine[i]+" ");
        }
        
    }
     private static void deccrypt(String strData) throws UnsupportedEncodingException
    {
        int nLength = strData.length();
        for(int nIndex=0;nIndex<nLength;nIndex++)
        {
        strData = strData.substring(nIndex, nIndex+1) + "@" + strData.substring(nIndex+1, strData.length());

        }
   System.out.println(strData);
    }
    
    
    //Character.toString ((char) i)
    public static void main(String[] args) throws UnsupportedEncodingException
    {
        Scanner oSc = new Scanner(System.in);
        String sLine = oSc.nextLine();
        //encrypt(sLine);
        deccrypt(sLine);
        
    }
    
}
