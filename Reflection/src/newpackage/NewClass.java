/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author lenova
 */
public class NewClass 
{
    private static NewClass nw = null;
    private int i = 1; 
    public NewClass(){}
    
    public int getI() 
    { 
        return i; 
    }  
    public static synchronized NewClass getInstance()
    {
        if (nw == null) 
        {
          nw = new NewClass();
        }
          return nw;

    }
    public NewClass newInstance()
    {
        
        return new NewClass();
    }
}