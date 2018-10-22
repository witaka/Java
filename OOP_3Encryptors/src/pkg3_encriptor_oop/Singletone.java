/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3_encriptor_oop;

/**
 *
 * @author lenova
 */
public class Singletone<T>
{
 
    private static Singletone<?> encriptor = new Singletone<Object>();
    public Singletone(){}
    T variable;
    public static synchronized Singletone<?> instance()
    {
          return encriptor;
    
    }

    public String encrypt(String x) {
       return x;
    }
   



}
