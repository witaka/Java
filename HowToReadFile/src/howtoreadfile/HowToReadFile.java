/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howtoreadfile;




import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;


public class HowToReadFile
{
    public static void main(String[] args) throws NoSuchAlgorithmException, FileNotFoundException, IOException 
    {   
        
		File file = new File("C:/12.txt");

		try (FileInputStream fis = new FileInputStream(file)) 
                {

			System.out.println("Total file size to read (in bytes) : "+ fis.available());

			int content;
			while ((content = fis.read()) != -1) 
                        {
				// convert to char and display it
				System.out.print((char) content);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
    
        

 