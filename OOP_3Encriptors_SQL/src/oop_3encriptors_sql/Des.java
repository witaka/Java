package oop_3encriptors_sql;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import sun.misc.BASE64Encoder;

public class Des
{
   public static SecretKey key;
    
    public String encript(String strVal) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException, InvalidKeySpecException
    {
        getKey();
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] byteVal = strVal.getBytes("UTF8");
        byte[] raw = cipher.doFinal(byteVal);
        BASE64Encoder encoder = new BASE64Encoder();
        String base6d = encoder.encode(raw).toString();
        return base6d.toString();
    }
    public static void getKey() throws InvalidKeySpecException, NoSuchAlgorithmException, InvalidKeyException 
    {
        String strKey = "rootroot";
        DESKeySpec desKeySpec = new DESKeySpec(strKey.getBytes());
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        key = keyFactory.generateSecret(desKeySpec);
      }
    
    
    public static void main(String[] args)
    {   

       try {
        String strVal ="22266668";
        getKey();
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] byteVal = strVal.getBytes();
        byte[] raw = cipher.doFinal(byteVal);
        BASE64Encoder encoder = new BASE64Encoder();
        String base6d = encoder.encode(raw).toString();

       } catch (NoSuchAlgorithmException ex) {
           Logger.getLogger(Des.class.getName()).log(Level.SEVERE, null, ex);
       } catch (NoSuchPaddingException ex) {
           Logger.getLogger(Des.class.getName()).log(Level.SEVERE, null, ex);
       } catch (InvalidKeyException ex) {
           Logger.getLogger(Des.class.getName()).log(Level.SEVERE, null, ex);

       } catch (IllegalBlockSizeException ex) {
           Logger.getLogger(Des.class.getName()).log(Level.SEVERE, null, ex);
       } catch (BadPaddingException ex) {
           Logger.getLogger(Des.class.getName()).log(Level.SEVERE, null, ex);
       } catch (InvalidKeySpecException ex) {
           Logger.getLogger(Des.class.getName()).log(Level.SEVERE, null, ex);
       }
       
   
        
    }


}    

