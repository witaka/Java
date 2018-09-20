/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redusecode;


public class Redusecode {
    private static final int N_TOTAL =49;
    private static final int N_SELECTIONS=6;
    
    public static void main(String[] args) 
    {
    double dNumberator =1,dNDenominator=1,dKNDenominator=1,dDenominator=1;
    for(int nCounter=N_TOTAL;nCounter>0;dNumberator *=nCounter,--nCounter);
    // {
       //dNumberator *=nCounter;
    //}
    for(int nCounter=N_SELECTIONS;nCounter>0; dNumberator *=nCounter,--nCounter);
    //{
       //dNDenominator*=nCounter; 
    //}
     for(int nCounter=N_TOTAL-N_SELECTIONS; nCounter>0; dKNDenominator*=nCounter,--nCounter);
    //{
      // dKNDenominator*=nCounter; 
    //}
     System.out.println("The odds of choosing the winning"+N_SELECTIONS+"number from"+ N_TOTAL+ "area 1: "+ (long)(dNDenominator/dNDenominator*dKNDenominator) );    
    //}
}}
