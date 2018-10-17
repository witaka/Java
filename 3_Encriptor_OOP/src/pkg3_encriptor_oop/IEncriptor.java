
package pkg3_encriptor_oop;

public interface IEncriptor 
{
    enum SECURITYLAVEL {low, good, invalid};
    public void setSecuritylevel(String sData,String sEncriptData);
    public SECURITYLAVEL getSecuritylevel();
    public String encript(String strData);
    public String decrypt(String strData);

 
}
