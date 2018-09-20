/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reflection;

import java.lang.reflect.Field;
import newpackage.NewClass;


public class Reflection 
{


    public static void main(String[] args) throws IllegalArgumentException, NoSuchFieldException, IllegalAccessException 
    {
        NewClass nw = new NewClass(); 
         
        Field field = nw.getClass().getDeclaredField("i"); 
        field.setAccessible(true); 
        field.setInt(nw, 5); 
        System.out.println(nw.getI());
    
    }
    
}
