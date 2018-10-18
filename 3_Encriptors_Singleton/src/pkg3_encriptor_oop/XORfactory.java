package pkg3_encriptor_oop;


public class XORfactory implements IEncriptorsFactory
{

    @Override
    public Encriptors getInstence() {
      return  XOR.instance();   
    }

    @Override
    public Encriptors newInstence()
    {
      return new XOR();    
    }
    
}
