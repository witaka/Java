/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downcasting;

/**
 *
 * @author lenova
 */
public class DownCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Parent ob = new ChildTwo();
        ChildTwo obChild = (ChildTwo)ob;
        obChild.chIMeth();
        
    }
    
}
