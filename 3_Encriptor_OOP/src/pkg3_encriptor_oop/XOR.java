
package pkg3_encriptor_oop;

public class XOR extends Encriptors
{
    public  char CONST=(char)255;
    private String flipBits(String strData)
    {
        String strResult ="";
        
        for (int nIndex =0; nIndex< strData.length(); ++nIndex)
        {
           strResult+= (char)(strData.charAt(nIndex)^CONST); 
            
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
          encriptor = new XOR();
        }
          return encriptor;
    }
    //----------v2 
    
}
