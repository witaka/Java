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
public class main {
    public static void main(String[] args) 
    {  
    /*IPrintable obA = Singleton<A>.instance();
    IPrintable obB = Singleton<B>.instance();*/
    
     Singletone<A> obA = (Singletone<A>)Singletone.instance();
     ob.print();
     
     
     A a = Singleton_s.instance();
     a.print();
 
     //obA.print();
     
   
     
    //IPrintable<A> obA = Singleton<A>.instance();
    //IPrintable<B> obB = Singleton<B>.instance();
    }
}
