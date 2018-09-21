/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Stack;

/**
 *
 * @Vitalii Besporstov
 */
public class Arrays 
{
    public static void main(String[] args) 
    {
        boolean bVal=true;
        int[] collList = {3,3,5,-2,-1,-4};
        Stack objMemory= new Stack();
        int nTempVal = collList[0];
        int nSteps=0;
        while(bVal)
        {
           if(objMemory.search(nTempVal)<=0)
           {
                if(nTempVal<=collList.length)
                {
                    objMemory.push(nTempVal);
                    //System.out.println("1---"+nTempVal);
                    //System.out.println("2---"+collList[nTempVal]);
                    collList[nTempVal] = nTempVal + collList[nTempVal];
                    //System.out.println("3---"+collList[nTempVal]);
                    nTempVal= collList[nTempVal];
                    nSteps++;
                    System.out.println("index: "+nTempVal);
                }
                else
                {
                    System.out.println("The index exceeds the arrey bondaries");
                    bVal=false;
                    System.out.println("Steps: "+nSteps);
                }
            }
            else
            {
                System.out.println("The index has already been  visited");
                bVal=false;
                System.out.println("Steps: "+nSteps);
            }    
        }   
    }   
}


/*  
int[] numbers = {813, 907, 908, 909, 910};

   
        int number = 907;
        boolean b = Arrays.asList(numbers).contains(number);
        System.out.println(b);
*/