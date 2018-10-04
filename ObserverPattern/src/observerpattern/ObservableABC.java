/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.awt.Event;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public abstract class ObservableABC implements IObservable
{
    public Map <IObserver, String> m_callObservers = new HashMap<>(); 
   
     
   /* public void notifyObservers(String strEvent)
    {
      List<IObserver> observerCollecton = map_lookapEvent(strEvent);
      
       for each(observer m_Collection)
       {   
           observer.notify(this,strEvent);
       }
    }*/
   protected abstract List<String> getEvents();
   public boolean add(IObserver ob, String strEvent)
    {
      m_callObservers.put(ob, strEvent);
       List<String> coolEvents =  getEvents();
      if(coolEvents.contains(strEvent))
      {
         System.out.println("event is correct");
         return true;
        
         
      }
       System.out.println("event is not correct");
       return false;
      
    }
    

    public void remove(IObserver ob, String strEvent)
    {
       m_callObservers.remove(ob);
    }

    @Override
    public void remove(IObserver ob)
    {
        
    }

   
}

