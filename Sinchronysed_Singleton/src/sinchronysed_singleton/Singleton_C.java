
package sinchronysed_singleton;


public class Singleton_C 
{
    private static Singleton_C sm_instance = null;
   
    private Singleton_C(){}
    
    public static  Singleton_C instence()
    {
         if(null==sm_instance)
         {
             synchronized (Singleton_C.class)
             {
                if(null==sm_instance)
                {
                  sm_instance = new Singleton_C();
                }
             }  
         }
         return sm_instance;
    
    }
    
}
