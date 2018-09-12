/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitflipper;

import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class BitFlipper {

   
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
    
    
    private static String simplyEncript(String strData)
    {
    long lStartTime =System.nanoTime();
    String strValue = flipBits(strData);
    long lDuration = System.nanoTime()-lStartTime;
    return strValue;
    }
    
    private static String simplyDecrypt(String strData)
    {
    long lStartTime =System.nanoTime();
    String strValue = flipBits(strData);
    long lDuration = System.nanoTime()-lStartTime;
    return strValue;
    }
    
    public static void main(String[] args) {
        
        String strValue = JOptionPane.showInputDialog(null, "input the string");
        String strEncrypted = simplyEncript(strValue);
        JOptionPane.showMessageDialog(null, strEncrypted);
        String strDecrypted = simplyDecrypt(strEncrypted);
        JOptionPane.showMessageDialog(null, strDecrypted);
    }
    
    
}
