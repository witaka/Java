/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MyObserver implements IObserver
{
  
    
   private List <IObserver> m_collObserver = new ArrayList <>();
     
   MyObserver()
   {
     
   }
     
   /* public void notifyObservers(String strEvent)
    {
      List<IObserver> observerCollecton = map_lookapEvent(strEvent);
      
       for each(observer m_Collection)
       {   
           observer.notify(this,strEvent);
       }
    }*/

    @Override
    public void notify(IObservable ob, String strEvent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
 
    
    
}
