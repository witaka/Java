/*
 * Debug to determine what this class and its method does.
 */
package whatami;

import javax.swing.JOptionPane;

/*----------------------------------------------------------------------------*\
 * The main application class
\*----------------------------------------------------------------------------*/
public class WhatAmI
{
    static long myMethod( int iVar1, int iVar2 )
    {
        long lData1 = 0;
        
        if (iVar1 <= 1)
        {
            lData1 = 1;
        }
        else
        {
            lData1 = iVar2 * myMethod(iVar1 - 1, iVar2);
        }
        
        return lData1;
    }

    /*----------------------------------------------------------------------------*\
     * main - The application execution entry point.
    \*----------------------------------------------------------------------------*/
    public static void main(String[] args)
    {
        String strData1 = "123";
        int iData1 = 3;
        String strData2 = "345";
        int iVar1 = 14;
        long lData1 = 0;
        
        try
        {
            strData1 = JOptionPane.showInputDialog("Enter the first number:");
            iData1 = Integer.parseInt(strData1);
            
            strData2 = JOptionPane.showInputDialog("Enter the the second number:");
            iVar1 = Integer.parseInt(strData2);
            
            lData1 = myMethod( iVar1, iData1 );
            
            // Display the result
            JOptionPane.showMessageDialog( null, "The " + iVar1 + "'s value from myMethod using " + iData1 + " is: " + lData1 );
        }
        catch ( NumberFormatException exNF )
        {
            JOptionPane.showMessageDialog( null, "Error: " + exNF.toString());
            System.exit( -1 );  // Exit with critical error value
        }
        
        System.exit( 0 );   // Success exit value
    }
}