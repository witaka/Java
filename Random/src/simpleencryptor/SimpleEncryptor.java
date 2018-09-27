/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleencryptor;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author drios
 */
public class SimpleEncryptor {

    private static String flipBits(String strData) {

        String strResult = "";

        for (int nIndex = 0; nIndex < strData.length(); ++nIndex) {
            strResult += (char) ~(strData.charAt(nIndex));
        }

        return strResult;

    }

    public static String simpleEncrypt(String strData) {
        long lStarttime = System.nanoTime();
        String strValue = flipBits(strData);
        long lDuration = System.nanoTime() - lStarttime;

        System.out.println("The encryption took :" + (lDuration / 1000));
        return strValue;

    }

    public static String simpleDeCrypt(String strData) {
        String strResult = "";

        for (int nIndex = 0; nIndex < strData.length(); ++nIndex) {
            strResult += (char) ~(strData.charAt(nIndex));
        }

        return strResult;

    }

    private static String generateRandomString() {

        Random rand = new Random();
        String strRandom = "";

        int nChars = rand.nextInt(400) + 20;

        for (int nIndex = 0; nIndex < nChars; ++nIndex) {
            int nOffset = rand.nextInt(26);
            strRandom += (char) ((int) 'A' + nOffset);
        }
        return strRandom;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String strValue = generateRandomString(); //JOptionPane.showInputDialog(null, "Input the string to process:");

        String strEncrypted = simpleEncrypt(strValue); //flipBits(strValue);

        JOptionPane.showMessageDialog(null, strEncrypted);

        String strDecrypted = flipBits(strEncrypted); //simpleDeCrypt(strEncrypted);

        JOptionPane.showMessageDialog(null, strDecrypted);

    }

}