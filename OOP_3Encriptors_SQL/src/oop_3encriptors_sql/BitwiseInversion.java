
package oop_3encriptors_sql;



class BitwiseInversion extends Encriptors
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
    
    //------v2 Sengleton
    private static BitwiseInversion encriptor = null;
    public BitwiseInversion(){}
    public static synchronized BitwiseInversion instance()
    {
        if (encriptor == null) 
        {
          encriptor = new BitwiseInversion();
        }
          return encriptor;
    }
    //------v2 
      
}
