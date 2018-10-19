/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_3encriptors_sql;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/**
 *
 * @author lenova
 */
public class AES{
 private static SecretKey SecKey;

    
     public void getKey() throws NoSuchAlgorithmException
     {
        KeyGenerator KeyGen=KeyGenerator.getInstance("AES");
        KeyGen.init(128);
        SecKey=KeyGen.generateKey();
     
     }
     public String encript(String strVal) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException
     {
        getKey();
        Cipher AesCipher=Cipher.getInstance("AES");
        AesCipher.init(Cipher.ENCRYPT_MODE,SecKey);
        byte[] byteText=strVal.getBytes();
        byte[] byteCipherText=AesCipher.doFinal(byteText);
      
        return byteCipherText.toString();
     }
    
}
