
package pkg3_encriptor_oop;


public class EncriptorsFactory
{

        
        public static Encriptors makeEncripor(String newTypeEncriptor)
        {        
	        Encriptors newEncriptor = null;
                
	         
	        if (newTypeEncriptor.equals("1"))
                {
	             
	            return new Additive();
	             
	        } 
                else if (newTypeEncriptor.equals("2"))
                {
 
	            return new BitwiseInversion();
	             
	        } 
                else if (newTypeEncriptor.equals("3"))
                {
 
	            return new XOR();
	             
	        }
                else return null;
	         
	}
	     
}


