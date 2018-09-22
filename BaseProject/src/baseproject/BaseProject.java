/*
 * Base Converter
 * @author Vitalii Besporstov
 */
package baseproject;

import java.util.Stack;
import javax.swing.JOptionPane;
import java.lang.StringBuffer;

public class BaseProject 
{
    
    public  static int getletterValue(String sLetter)   //method get number value of letters, A, B, C, etc 
    { 
        int nLetterValue=0; //declaration number value =0;
        switch(sLetter)//get number value of select letter
        {
            case "A": nLetterValue=10;break;
            case "B": nLetterValue=11;break;
            case "C": nLetterValue=12;break;
            case "D": nLetterValue=13;break;
            case "E": nLetterValue=14;break;
            case "F": nLetterValue=15;break;
            case "H": nLetterValue=17;break;
            case "I": nLetterValue=18;break;
            case "J": nLetterValue=19;break;
            case "K": nLetterValue=20;break;
            case "L": nLetterValue=21;break;
            case "M": nLetterValue=22;break;
            case "N": nLetterValue=23;break;
            case "O": nLetterValue=24;break;
            case "P": nLetterValue=25;break;
            case "Q": nLetterValue=26;break;
            case "R": nLetterValue=27;break;
            case "S": nLetterValue=28;break;
            case "T": nLetterValue=29;break;
            case "U": nLetterValue=30;break;
            case "V": nLetterValue=31;break;
            case "W": nLetterValue=32;break;
            case "Y": nLetterValue=33;break;
            case "Z": nLetterValue=34;break;
            default:System.err.println("error");              
        }
        return nLetterValue;
  
    }
    
    public  static String getNumberValueToLetter(int nNumber)//method letter representation in base system     
    { 
        String sValueToLetter=""; //declaration of emty string;
        switch(nNumber)//get letter representation by nomber  
        {
            case 10: sValueToLetter="A";break;
            case 11: sValueToLetter="B";break;
            case 12: sValueToLetter="C";break;
            case 13: sValueToLetter="D";break;
            case 14: sValueToLetter="E";break;
            case 15: sValueToLetter="F";break;
            case 16: sValueToLetter="H";break;
            case 17: sValueToLetter="I";break;
            case 18: sValueToLetter="J";break;
            case 19: sValueToLetter="K";break;
            case 20: sValueToLetter="L";break;
            case 21: sValueToLetter="M";break;
            case 22: sValueToLetter="N";break;
            case 23: sValueToLetter="O";break;
            case 24: sValueToLetter="P";break;
            case 25: sValueToLetter="Q";break;
            case 26: sValueToLetter="R";break;
            case 27: sValueToLetter="S";break;
            case 28: sValueToLetter="T";break;
            case 29: sValueToLetter="U";break;
            case 30: sValueToLetter="V";break;
            case 31: sValueToLetter="W";break;
            case 32: sValueToLetter="Y";break;
            case 33: sValueToLetter="Z";break;
            default:System.err.println("error");              
        }
        return sValueToLetter;
  
    }
    
    public static boolean ifNumber (String sVal)//method check if sVal is number
    {  
        try
        {  
          int nNuber=Integer.parseInt(sVal); // if it is possible to convert sVal to int return true 
        }  
        catch(NumberFormatException nfe)//if not error ->  Exception -> return false
        {  
          return false;  
        }  
        return true;  
    }
    
    public static int getDecimalNumber(int nBaseSystemVal,String sValInTheSystem)//method convert number in base-10
    {
        int nDecNumber =0;//Declaration of  number in base-10 int
        int nExponent= 0;//Declaration of Exponent int
        char[] collValInTheSystem = sValInTheSystem.toCharArray();//create the char arrey out string
        int nLength=collValInTheSystem.length;//Declaration of int variable wich get arrey length
        for(int iNumber=nLength-1;iNumber>=0;--iNumber)// Loop through all numbers in the char arrey 
        {
            String sVal=String.valueOf(collValInTheSystem[iNumber]);//get string value of  char array element by position
            if(ifNumber(sVal))//method check if sVal is numbe=> true/false
            {
                 int nVal=Integer.parseInt(sVal);//get string value of  char array element by position
                 nDecNumber +=nVal*Math.pow(nBaseSystemVal,nExponent);// Colculate number in base 10
                 nExponent++;
            }
            else
            {
                 int nVal=getletterValue(sVal);//get number value of letters, A, B, C, etc
                 nDecNumber +=nVal*Math.pow(nBaseSystemVal,nExponent);// Colculate number in base 10
                 nExponent++;   
            }
        }
        return nDecNumber;//return number in base 10
    }
    
    
    public static boolean ifNumberBelongsBase (int nBaseSystemVal,String sValInTheSystem)// check if number belongs to particular base true/false
    {
        boolean bBelongsBaseFlag = true;//Declaration of variable wich represent if number belongs to particular base ->  true
        char[] collValInTheSystem = sValInTheSystem.toCharArray();//convert string value of the number in the base to char array
        int nLength=collValInTheSystem.length;//Declaration of int variable wich get arrey length
         for(int iNumber=nLength-1;iNumber>=0;--iNumber)//reverse loop through char array collValInTheSystem
        { 
            String sVal=String.valueOf(collValInTheSystem[iNumber]);//get string value of  char array element by position
            if(ifNumber(sVal))// if verible Sval is number ->true/flse
            {
                 int nVal=Integer.parseInt(sVal);//convert string to int 
                 if(nVal>=nBaseSystemVal)//check if th enumber is smoler then base system value 
                 {
                    bBelongsBaseFlag = false;
                 }
            }
            else
            {
                 int nVal=getletterValue(sVal);//get number value of letters, A, B, C, etc
                 if(nVal>=nBaseSystemVal)//check if th enumber is smoler then base system value 
                 {
                    bBelongsBaseFlag = false;
                 }
                    
            }
        }
        return bBelongsBaseFlag;
    }
    
    public static void getNewValInNewBase(int nFutureBaseNumSystemVal, int nNewBaseSystemVal)
    {
        StringBuffer objPrintBuffer = new StringBuffer();
        Stack objNewValStack = new Stack();
        while(nFutureBaseNumSystemVal!=0)
        {
            int nTempNumber = nFutureBaseNumSystemVal%nNewBaseSystemVal;
            nFutureBaseNumSystemVal = (int)nFutureBaseNumSystemVal/nNewBaseSystemVal;
            objNewValStack.push(nTempNumber);
        }
        
        while( !(objNewValStack.empty()))
        {
            if((int)(objNewValStack.peek())>=10)
            {
                int nTemp = (int)objNewValStack.pop();
                String sTemp = getNumberValueToLetter(nTemp);
                objPrintBuffer.append(sTemp);
            }
            else
            {
                objPrintBuffer.append(objNewValStack.pop());
            }
        }
        JOptionPane.showMessageDialog(null,"Value under " + nNewBaseSystemVal + " base : "+ objPrintBuffer.toString());
        
    }
    
    public static void main(String[] args)
    { 
        String sBaseSystemVal = JOptionPane.showInputDialog(null, "Enter base system value");// get a base numbering system value(String) 
        int nBaseSystemVal = Integer.parseInt(sBaseSystemVal);//  type conversion from String to int
        int nDecimalNumber =0;//Declaration of variable wich represent number in base-10
        if(nBaseSystemVal>=2 & nBaseSystemVal<=35)//check that numbering system ranges are valid=>2-35
        {
            String sValInTheSystem = JOptionPane.showInputDialog(null, "Enter your number");//get the number in the base numbering system value(String)
            if(ifNumberBelongsBase(nBaseSystemVal,sValInTheSystem))// method check if number belongs to particular base true/false
            {   
                String sNewBaseSystemVal = JOptionPane.showInputDialog(null, "Write this number under base");//get a future base numbering system value(String)
                int nNewBaseSystemVal = Integer.parseInt(sNewBaseSystemVal);//  type conversion from String to int
                if(nNewBaseSystemVal>=2 & nNewBaseSystemVal<=35)//check that numbering system ranges are valid=>2-35
                {
                    nDecimalNumber = getDecimalNumber(nBaseSystemVal,sValInTheSystem);//method convert number in base-10
                    JOptionPane.showMessageDialog(null,"Value in 10 base : " + nDecimalNumber);//print Value in 10 base
                    getNewValInNewBase(nDecimalNumber,nNewBaseSystemVal);// method convert number from base-10 to select base value 
                }
                else
                {
                       
                    JOptionPane.showMessageDialog(null, "Please choose base from 2 to 35");
                }
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "The number does not match select Base System");
            }
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Please choose base from 2 to 35");
        }
       
    }
    
}
