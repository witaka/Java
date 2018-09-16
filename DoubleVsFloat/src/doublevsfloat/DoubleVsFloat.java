/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublevsfloat;

/**
 *
 * @author lenova
 */
public class DoubleVsFloat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float  fVal =1.15F;
       double dVal =1.15;
       
       int nFResult=(int)(fVal*100);
       int nDResult=(int)(dVal*100);
       
       System.out.println("Float-"+nFResult);
       System.out.println("Double-"+nDResult);
    }
    
}
