
package pkg3_encriptor_oop;


public class BitwiseInversion extends Encriptors
{
    char chVal=(char)255;
    
    public static String flipBits(String strData)
    {
        String strResult ="";
        
        for (int nIndex =0; nIndex< strData.length(); ++nIndex)
        {
           strResult+= (char)~(strData.charAt(nIndex));   
        }
        return strResult;
    } 
    
    @Override
    public String encript(String strData) 
    {
       long lStartTime =System.nanoTime();
       String strValue = flipBits(strData);
       long lDuration = System.nanoTime()-lStartTime;
       return strValue;
    }

    @Override
    public String decrypt(String strData) 
    {
        long lStartTime =System.nanoTime();
        String strValue = flipBits(strData);
        long lDuration = System.nanoTime()-lStartTime;
        return strValue;  
    }
    
    @Override
    protected  SECURITYLAVEL getDefaultSecuritylevel()
    {
        return SECURITYLAVEL.good;
    }
    
    //-----------v2
        public synchronized Encriptors BitwiseInversion()
    {
        if (encriptor == null) 
        {
          encriptor = new Additive();
        }
          return encriptor;
    }
    //----------v2    
      
}
