/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_3encriptors_sql;

/**
 *
 * @author lenova
 */
public class Singletone
{
    private static Singletone encriptor = new Singletone();
    public Singletone(){}
    public static synchronized Singletone instance()
    {
          return encriptor;
    
    }
}
