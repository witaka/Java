
package pkg3_encriptor_oop;

public class Additive extends Encriptors
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

    /*
    public Additive(){}
    
    public synchronized Encriptors instance()
    {
        if (encriptor == null) 
        {
          encriptor = new Additive();
        }
          return encriptor;
    }
    */
}
