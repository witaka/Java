/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
import java.util.Iterator;

 class Observers<T extends Observer> extends ArrayList<T> 
 {
        public void notifyObjectCreated(Object obj) 
        {
            for (Iterator<T> iter = (Iterator<T>) iterator(); iter.hasNext();)
                iter.next().objectCreated(obj);
        }
        public void notifyObjectModified(Object obj)
        {
            for (Iterator<T> iter = (Iterator<T>) iterator(); iter.hasNext();)
                iter.next().objectModified(obj);
        }
    }