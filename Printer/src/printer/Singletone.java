/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printer;

/**
 *
 * @author lenova
 */
public class Singletone<T>
{
    private final static Singletone<?> abc = new Singletone<Object>();
    public Singletone(){}
    
    public static synchronized Singletone<?> instance()
    {
          return abc;
    
    }


    
}
