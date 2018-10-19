/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_3encriptors_sql;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class MD5 
{
    public String encript(String strVal) throws NoSuchAlgorithmException
    {
        MessageDigest m = MessageDigest.getInstance("MD5");
        m.reset();
        m.update(strVal.getBytes());
        byte[] digest = m.digest();
        BigInteger bigInt = new BigInteger(1,digest);
        String hashtext = bigInt.toString(16);
        // Now we need to zero pad it if you actually want the full 32 chars.
        while(hashtext.length() < 32 )
        {
             hashtext = "0"+hashtext;
        }
        return hashtext;
    }
    
    
    
}
