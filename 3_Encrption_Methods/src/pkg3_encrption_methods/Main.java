
package pkg3_encrption_methods;

import java.util.Random;


public class Main {

    private static String generateRandomString() {

        Random rand = new Random();
        String strRandom = "";

        int nChars = rand.nextInt(400) + 20;

        for (int nIndex = 0; nIndex < nChars; ++nIndex) {
            int nOffset = rand.nextInt(26);
            strRandom += (char) ((int) 'A' + nOffset);
        }
        return strRandom;
    }

    public static void main(String[] args) {
        int nLength = 0;
        double nEfficienry_1=0; 
        double nEfficienry_2=0; 
        double nEfficienry_3=0; 
        double nTime=0;
        for(int iIndex=0;iIndex<10000;iIndex++)
        {
            String strValue = generateRandomString(); 
            nLength+=strValue.length();

            ProgFiletimer obTime1 = new ProgFiletimer();
            Additive objAdd = new Additive();
            objAdd.encrypt(strValue);
            objAdd.decrypt(strValue);
            obTime1.printElapsedTime();
            nTime = (int)obTime1.elapsedTimeMS();
            nEfficienry_1 +=nTime/nLength;
            System.out.println("Efficienry: "+nEfficienry_1);

            ProgFiletimer obTime2 = new ProgFiletimer();
            BitwiseInversion objBitIn = new BitwiseInversion();
            objBitIn.simplyEncript(strValue);
            objBitIn.simplyDecrypt(strValue);
            obTime2.printElapsedTime();
            nTime = (int)obTime2.elapsedTimeMS();
            nEfficienry_2 +=nTime/nLength;
            System.out.println("Efficienry:"+nEfficienry_2);


            ProgFiletimer obTime3 = new ProgFiletimer();
            XOR objXor = new XOR();
            objXor.simplyEncript(strValue);
            objXor.simplyDecrypt(strValue);
            obTime3.printElapsedTime();
            nTime = (double)obTime3.elapsedTimeMS();
            nEfficienry_3 +=nTime/nLength;
            System.out.println("Efficienry: "+nEfficienry_3);
        }
        System.out.println("Total String length: "+nLength);
        System.out.println("Average String size: "+nLength/10000);
        System.out.println("Additive: "+nEfficienry_1);
        System.out.println("Bitwise Inversion: "+nEfficienry_2);
        System.out.println("XOR: "+nEfficienry_3);
         
    }
    
}
