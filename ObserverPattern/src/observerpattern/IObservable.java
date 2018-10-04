
package observerpattern;

import java.awt.Event;
import java.util.List;


interface  IObservable 
{
   public boolean add(IObserver ob, String strEvent);
   public void remove(IObserver ob);
   public void remove(IObserver ob,String strEvent);
}
