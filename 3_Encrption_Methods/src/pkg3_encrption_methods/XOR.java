/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3_encrption_methods;

/**
 *
 * @author lenova
 */
public class XOR 
{
    public static char CONST=(char)255;
    private static String flipBits(String strData)
    {
        String strResult ="";
        
        for (int nIndex =0; nIndex< strData.length(); ++nIndex)
        {
           strResult+= (char)(strData.charAt(nIndex)^CONST); 
            
        }
        return strResult;
    }
    
    
    public static String simplyEncript(String strData)
    {
    long lStartTime =System.nanoTime();
    String strValue = flipBits(strData);
    long lDuration = System.nanoTime()-lStartTime;
    return strValue;
    }
    
    public static String simplyDecrypt(String strData)
    {
    long lStartTime =System.nanoTime();
    String strValue = flipBits(strData);
    long lDuration = System.nanoTime()-lStartTime;
    return strValue;
    }
}
