/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenova
 */
public class MyObservable extends ObservableABC 
{

    protected List<String> getEvents()
    {
      List<String> collEvents = new ArrayList<>();
      collEvents.add("click");
      return collEvents;
    }
    
}
