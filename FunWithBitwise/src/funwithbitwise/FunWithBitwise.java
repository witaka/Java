/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithbitwise;

/**
 *
 * @author Ed.Mahon
 */
public class FunWithBitwise
{
    public static void main(String[] args)
    {
        // Byte value versions
        byte byA = (byte)0b10100101;
        byte byB = (byte)0b01101100;
        byte byC = (byte)0b10010011;
        byte byD = (byte)0b01011010;
        byte byResult = 0;
        
        // Integer value versions
        int iA = 0b10100101;
        int iB = 0b01101100;
        int iC = 0b10010011;
        int iD = 0b01011010;
        int iResult = 0;
        
        // Bitwise operations with byte data
        System.out.println("Running tests with byte data...");
        byResult = (byte)(byA & byB);   // Bitwise AND
        System.out.println(byResult);

        byResult = (byte)(byB | byD);   // Bitwise OR
        System.out.println(byResult);

        byResult = (byte)(byC & byD);   // Bitwise AND
        System.out.println(byResult);

        byResult = (byte)(byA | byD);   // Bitwise OR
        System.out.println(byResult);
      

        // Bitwise operations with integer data
        System.out.println("Running tests with integer data...");
        iResult = (iA & iB);   // Bitwise AND
        System.out.println(iResult);

        iResult = (iB | iD);   // Bitwise OR
        System.out.println(iResult);

        iResult = (iC & iD);   // Bitwise AND
        System.out.println(iResult);

        iResult = (iA | iD);   // Bitwise OR
        System.out.println(iResult);
    }
    
}