/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectcompare;

import java.util.Comparator;

/**
 *
 * @author lenova
 */
class Person implements Comparator<Person>,Comparable<Person>
{
   public String m_strName;
   Person(){}
   Person(String strName)
   {
     m_strName = strName;
   }


    @Override
    public int compare(Person t, Person t1) {
        return(this.m_strName).compareTo(t1.m_strName);
    }

    @Override
    public int compareTo(Person t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
