/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaragecalculator;

/**
 *
 * @author lenova
 */
public class AvarageCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       double fTotal=0.0;
       double f1=1.2;
       double f2=1.3;
       double f3=1.2;
       double f4=1.3;
       double f5=2;
       
       fTotal+=f1*0.13;
       fTotal+=f2*0.13;
       fTotal+=f3*0.13;
       fTotal+=f4*0.13;
       fTotal+=f5*0.13;
      
       
       System.out.println(fTotal);
        
        // TODO code application logic here
    }
    
}
