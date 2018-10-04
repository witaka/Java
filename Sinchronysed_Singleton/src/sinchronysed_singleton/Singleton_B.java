
package sinchronysed_singleton;


public class Singleton_B 
{
    private static Singleton_B sm_instance = new Singleton_B();
   
    private Singleton_B(){}
    
    public static  Singleton_B instence()
    {
         if(null==sm_instance)
         {
             sm_instance = new Singleton_B();
         }
         return sm_instance;
    
    }
    
}
