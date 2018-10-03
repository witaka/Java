/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

   public class Subject {
        Observers observers = new Observers();

        private Object field;

        public void setField(Object o) {
            field = o;
            observers.notifyObjectModified(this);
        }
    }