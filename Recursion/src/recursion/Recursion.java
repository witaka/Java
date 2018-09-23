/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author lenova
 */
public class Recursion 
{
    
    public static void main(String[] args) 
    {
        double dFactorial = calcFactorial(3);
        System.err.println(dFactorial);
    }
    

    public static double calcFactorial( double dVal)
    {
        if( dVal == 1)
        {
            return 1;
        }
         else
        {
           return (dVal*(calcFactorial(dVal-1)));
        }
    }

}

/*
    public static double calcFactorial(double dVal)
    {        
        if(dVal == 0) 
        {
            return 1;
        }
        else
        {    
            return calcFactorial_1(dVal, 1);
        }
    }

    public static double calcFactorial_1(double dVal, double dFactorial) 
    {
        if(dVal == 1) 
        {
            return dFactorial;
        }
        else 
        {
            return calcFactorial_1(dVal - 1,dFactorial*dVal);
        }
    }
}*/