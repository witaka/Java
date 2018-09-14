/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author lenova
 */
public class TicTacToe 
{

    public static void drowField(char[][] collField)
    { 
        System.out.print("  ");
       	System.out.print(" A ");
        System.out.print(" B ");
        System.out.print(" C  ");
	System.out.println("");
        for(int i=0; i<3; i++)
        {
            System.out.print(i+"|"); 
	    for(int j=0; j<3; j++)
            {		 
		 System.out.print("_");
                 collField[i][j]='*';
		 System.out.print(collField[i][j]+"|");		
	    }	
        System.out.println("");
        } 
    
    }
    
    public static void yourStep(int x, int y, char[][] collField)
    { 
        if(collField[x][y]=='*')
        {
            collField[x][y]='0';
            System.out.print("  ");
            System.out.print(" A ");
            System.out.print(" B ");
            System.out.print(" C  ");
            System.out.println("");
            for(int i=0; i<3; i++)
            {
                System.out.print(i+"|"); 
                for(int j=0; j<3; j++)
                {		 
                     System.out.print("_");
                     System.out.print(collField[i][j]+"|");		
                }	
            System.out.println("");
        } 
        }
        else
        {
            System.out.println("pole zanato try again");
            System.out.println("enter the coordinates, for example  1A");
            Scanner obgScanner = new Scanner(System.in);
            x = obgScanner.nextInt();
            y = obgScanner.nextInt();
            yourStep(x,y,collField);
        }  
    }
     public static void compStep(int x, int y, char[][] collField)
    { 
        if(collField[x][y]=='*')
        {
            collField[x][y]='X';
            System.out.print("  ");
            System.out.print(" A ");
            System.out.print(" B ");
            System.out.print(" C  ");
            System.out.println("");
            for(int i=0; i<3; i++)
            {
                System.out.print(i+"|"); 
                for(int j=0; j<3; j++)
                {		 
                     System.out.print("_");
                     System.out.print(collField[i][j]+"|");		
                }	
            System.out.println("");
        } 
        }
        else
        {
            Random objRandom = new Random();
            x = objRandom.nextInt(3);
            y = objRandom.nextInt(3);
            compStep(x,y,collField);
        }  
    }
    public void ifWinLine(char[][] collField)
    {
        char cThemp = 'X';
        int nStep =0;
        int i=0;
                for(int j=0; j<3; j++)
                {
                  if(nStep==3)
                  { 
                    if(cThemp == collField[i][j])
                    {
                        nStep++;
                    }
                
                  }
                  else
                  {
                  }
                }  

    }
  
    public static void main(String[] args) 
    {
        char[][] collField = new char[3][3];
        boolean bFlag=true;
        drowField(collField);
        Scanner obgScanner = new Scanner(System.in);
        while(bFlag)
        {
            System.out.println("Enter the coordinates, for example  1A");
            int x = obgScanner.nextInt();
            int y = obgScanner.nextInt();
            yourStep(x,y,collField);
            Random objRandom = new Random();
            int nX = objRandom.nextInt(3);
            int nY = objRandom.nextInt(3);
            compStep(nX,nY,collField);
        }
        
    }
    
}
