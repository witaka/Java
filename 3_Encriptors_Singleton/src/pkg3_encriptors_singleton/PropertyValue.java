/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3_encriptors_singleton;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyValue
{
	InputStream inputStream;
 
	public String getPropValues() throws IOException
        {
			Properties prop = new Properties();
			String propFileName = "properties.properties";
			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
                        prop.load(inputStream);
			String factory = prop.getProperty("encriptor");
			System.out.println(factory);
                        return factory;
 
}


}
