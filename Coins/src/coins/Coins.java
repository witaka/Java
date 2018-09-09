package coins;
import javax.swing.JOptionPane;


public class Coins {

    public static void main(String[] args) {
        final float FV25 = 0.25F;
        final float FV10 = 0.10F;
        final float FV05 = 0.05F;
        final float FV01 = 0.01F;
        float fAmount = Float.parseFloat(args[0]);
        
        System.out.println("Total Amount: "+fAmount);

        int iAmount25 = (int)Math.floor(fAmount/FV25);
        System.out.println("Amount of 25: "+iAmount25);
        fAmount=fAmount-(iAmount25*FV25);

        int iAmount10 = (int)Math.floor(fAmount/FV10);
        System.out.println("Amount of 10: "+iAmount10);
        fAmount=fAmount-(iAmount10*FV10);

        int iAmount05 = (int)Math.floor(fAmount/FV05);
        System.out.println("Amount of 5: "+iAmount05);
        fAmount=fAmount-(iAmount05*FV05);

        int iAmount01 = (int)Math.floor(fAmount/FV01);
        System.out.println("Amount of 1 : "+iAmount01);  
     }
    
}
