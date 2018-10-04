
package sinchronysed_singleton;


public class Singleton_A 
{
    private static Singleton_A sm_instance = null;
   
    private Singleton_A(){}
    
    public static synchronized Singleton_A instence()
    {
         if(null==sm_instance)
         {
             sm_instance = new Singleton_A();
         }
         return sm_instance;
    
    }
    
}
