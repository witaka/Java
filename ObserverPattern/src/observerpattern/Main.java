
package observerpattern;


public class Main 
{
    public static void main(String[] args)
    {
        MyObserver obClient = new MyObserver();
        MyObservable obO = new MyObservable();
        obO.add(obClient,"click");
        obO.add(obClient,"event2");
        obO.add(obClient,"event2");
        obO.add(obClient,"event2");
        obO.add(obClient,"event2");
    }
    
}
