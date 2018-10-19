package oop_3encriptors_sql;


import java.util.Arrays;

public abstract class Encriptors implements IEncriptor
{
    private SECURITYLAVEL eSlevel=SECURITYLAVEL.invalid;

  
    private boolean ifArreycontain(String sData,String sEncriptData)
    {
        char [] cData = sData.toCharArray();
        char [] cEncriptData = sEncriptData.toCharArray();
        boolean bFlag = false;
        for(int i=1;i<sData.length();i++)
        {
            char cVal=cData[i];
            bFlag = Arrays.asList(cEncriptData).contains(cVal);
            System.out.println(bFlag);
        }
        return bFlag;
    }
    
    public void setSecuritylevel(String sData,String sEncriptData)
    {
        if(ifArreycontain(sData,sEncriptData))
        {
             eSlevel = SECURITYLAVEL.good;
        }
        else
        {
             eSlevel = SECURITYLAVEL.low;    
        }
       
    }   
    @Override
    public SECURITYLAVEL getSecuritylevel()
    {
        if(eSlevel==SECURITYLAVEL.invalid)
        {
           return getDefaultSecuritylevel();
        }
        return eSlevel;
    }
    
     protected abstract SECURITYLAVEL  getDefaultSecuritylevel();
    
}
