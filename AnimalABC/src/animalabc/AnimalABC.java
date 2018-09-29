
package animalabc;

public abstract class AnimalABC implements IAnimal
{
    private String m_strName="";
    
    @Override
    public void setName(String strName) 
    {
       m_strName=strName;
    }

    @Override
    public String getName() 
    {
       return m_strName;
    }

    
}
