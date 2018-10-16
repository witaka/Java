
package pkg3_encrption_methods;

public class Additive 
{
 public static String encrypt(String strData) 
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
     public static String decrypt(String strData) 
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
}
