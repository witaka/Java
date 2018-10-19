/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_3encriptors_sql;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author lenova
 */
public class Sha1 
{
    public static String encript(String strVal) throws NoSuchAlgorithmException
        {
            MessageDigest m = MessageDigest.getInstance("SHA1");
            m.reset();
            m.update(strVal.getBytes());
            byte[] digest = m.digest();
            BigInteger bi = new BigInteger(1, digest);
            String hex = bi.toString(16);
            int paddingLength = (digest.length * 2) - hex.length();
            if(paddingLength > 0)
                return String.format("%0" + paddingLength + "d", 0) + hex;
            else
                return hex;
        }    
}
