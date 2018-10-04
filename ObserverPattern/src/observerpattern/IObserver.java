
package observerpattern;


public interface IObserver 
{
  // public void add(IObservable ob);
   //public void remove (IObservable ob);
   public void notify(IObservable ob, String strEvent);
   
}
