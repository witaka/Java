
package pkg3_encriptor_oop;




public class Main 
{
    public static void main(String[] args) 
    {   
        Singletone<XOR> xor = (Singletone<XOR>)Singletone.instance(); 
        Singletone<Additive> additive = (Singletone<Additive>)Singletone.instance();
        String s = xor.encrypt("sfsf");
        String v = additive.encrypt("sgsg");
        System.out.println(s+v);

    }   
        
      
}
    

