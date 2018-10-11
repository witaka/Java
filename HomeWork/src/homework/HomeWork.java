package homework;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;


public class HomeWork {

    public static int mAsciiToInt(char cAsciiVal) {
            int iAsciiVal = (int)cAsciiVal;
            int iNumVal = Character.getNumericValue(iAsciiVal);
            return iNumVal;
    }

    public static void main(String[] args) throws UnsupportedEncodingException { 
        Scanner oSc = new Scanner(System.in);
        String sLine = oSc.nextLine();
        char cLine[] = sLine.toCharArray();
        byte bLine[] = sLine.getBytes("US-ASCII");
        int x =bLine.length-1;
        int iSum =mAsciiToInt(cLine[0]);

        for(int i=0;i<x;i++){
            if(bLine[i]>=48){
                if(bLine[i]<=57){
                    int iCase=bLine[i+1];
                        switch(iCase){
                            case 42: iSum =iSum * mAsciiToInt(cLine[i+2]);
                                  break;
                            case 43: iSum= iSum + mAsciiToInt(cLine[i+2]); 
                                  break;
                            case 45: iSum =iSum - mAsciiToInt(cLine[i+2]);
                                  break;
                            case 47: iSum =iSum / mAsciiToInt(cLine[i+2]);
                                  break;      
                        }

                } else{System.err.println("Wrong input format"); iSum=0; break;} 
              
            }
      
        }
        System.out.println("Total: "+iSum);
          
    }    
}
