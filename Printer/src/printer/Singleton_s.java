/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printer;


public class Singleton_s 
{
    private static A instance = new A();
    public Singleton_s(){}
    public static synchronized A instance()
    {
          return instance;
    }
    
}

