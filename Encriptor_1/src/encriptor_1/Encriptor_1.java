
package encriptor_1;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import java.io.UnsupportedEncodingException;

/**
 *
 * @author lenova
 */
public class Encriptor_1 {

 private static String encrypt(String strData) 
    {
      char[] cData = new char[100];
        cData = strData.toCharArray();
        int nLength = cData.length;
        for(int nIndex=0;nIndex<nLength/2;nIndex++)
        { 
           int nFirst = nIndex;
           int nSecond = nLength - nIndex -1;
           char cTemp=cData[nFirst];
           cData[nFirst]=cData[nSecond];
           cData[nSecond]=cTemp; 
        }
         return new String(cData);   
        
    }
     private static String decrypt(String strData) 
    {
        char[] cData = new char[100];
        cData = strData.toCharArray();
        int nLength = cData.length;
        for(int nIndex=0;nIndex<nLength/2;nIndex++)
        { 
           int nFirst = nIndex;
           int nSecond = nLength - nIndex -1;
           char cTemp=cData[nFirst];
           cData[nFirst]=cData[nSecond];
           cData[nSecond]=cTemp; 
        }
         return new String(cData);     
    }
    
    
    //Character.toString ((char) i)
    public static void main(String[] args) throws UnsupportedEncodingException
    {
        ProgFiletimer obTime = new ProgFiletimer();
        Scanner oSc = new Scanner(System.in);
        String strLine = oSc.nextLine();
        encrypt(strLine);
        String strNewLine = encrypt(strLine);
        System.out.println(strNewLine);
        System.out.println(decrypt(strNewLine));  
        obTime.printElapsedTime();
    }
    
}
