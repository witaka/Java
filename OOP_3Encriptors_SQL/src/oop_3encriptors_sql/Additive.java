
package oop_3encriptors_sql;



class Additive extends Encriptors//packeg 
{
    @Override
    public String encript(String strData) {
        char[] cData = new char[100];
        cData = strData.toCharArray();
        int nLength = cData.length;
        for(int nIndex=0;nIndex<nLength/2;nIndex++)
        { 
           int nFirst = nIndex;
           int nSecond = nLength - nIndex -1;
           char cTemp=cData[nFirst];
           cData[nFirst]=cData[nSecond];
           cData[nSecond]=cTemp; 
        }
         return new String(cData);  
    }
    
    @Override
    public String decrypt(String strData) 
    {
        char[] cData = new char[100];
        cData = strData.toCharArray();
        int nLength = cData.length;
        for(int nIndex=0;nIndex<nLength/2;nIndex++)
        { 
           int nFirst = nIndex;
           int nSecond = nLength - nIndex -1;
           char cTemp=cData[nFirst];
           cData[nFirst]=cData[nSecond];
           cData[nSecond]=cTemp; 
        }
         return new String(cData);     
    }    
    
    @Override
    protected  SECURITYLAVEL getDefaultSecuritylevel()
    {
        return SECURITYLAVEL.good;
    }

    //------v2 Sengleton
    private static Additive encriptor = null;
    public Additive(){}
    public static synchronized Additive instance()
    {
        if (encriptor == null) 
        {
          encriptor = new Additive();
        }
          return encriptor;
    }
    //------v2
}
