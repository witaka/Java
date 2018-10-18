
package pkg3_encriptors_singleton;

import java.io.IOException;
import pkg3_encriptor_oop.Encriptors;
import pkg3_encriptor_oop.IEncriptorsFactory;
import pkg3_encriptor_oop.XOR;


public class Main 
{
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException
    {
	PropertyValue properties = new PropertyValue();
	String sConfigValue  = properties.getPropValues();
        IEncriptorsFactory encriptorFactory = (IEncriptorsFactory)Class.forName(sConfigValue).newInstance();
        Encriptors encriptor =encriptorFactory.getInstence();
        System.err.println(encriptor.decrypt("sfsgf"));
                

    }   
        public void getEncript(XOR xor,String str)
        {
                
                
        }
        
}
    

