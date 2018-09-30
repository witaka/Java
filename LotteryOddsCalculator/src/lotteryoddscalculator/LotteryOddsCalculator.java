/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteryoddscalculator;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/**
 *
 * @author lenova
 */
public class LotteryOddsCalculator {

    public static double factorial(int nNumber) {
       double nFact = 1; 
        for (int i = 1; i <= nNumber; i++) {
            nFact =i*nFact;
            //System.out.println(i+"----"+nFact);
        }
        return nFact;
    }


    public static void main(String[] args) {
      int iNnumber =3;
      int IKnomber =4;
        
      double nOdds =factorial(IKnomber)/factorial(iNnumber)*factorial(IKnomber-iNnumber);
      System.out.println("Odds: "+(long)nOdds);
    }
    
}
