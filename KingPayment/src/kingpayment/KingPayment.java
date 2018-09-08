package kingpayment;

public class KingPayment {

    public static void main(String[] args) {
        final int I_MAX_DAYS=30;
        final int I_SONE_MULTIPLIER=2;
        int i_totalStones=0;
        int i_stonesToday=0;
        
        
        for(int i_currentDay =1;i_currentDay<I_MAX_DAYS;i_currentDay++){
          
          i_stonesToday =(int) Math.pow(I_SONE_MULTIPLIER,i_currentDay-1);
          i_totalStones=i_totalStones+i_stonesToday;
        }
          
        System.out.println(i_totalStones);
           
    }
    

