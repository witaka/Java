
package rps;

import java.util.Random;
import java.util.Scanner;

public class RPS 
{
    
    enum RPSG { paper, rock,sessors }
    
    public static void main(String[] args) 
    {
        RPSG ePlayer_1 = RPSG.rock;
        RPSG ePlayer_2 = RPSG.rock;
        int nPlayer_1_win =0;
        int nPlayer_2_win =0;
        int nTies=0;
        boolean bVal =true;
        while(bVal)
        {
            System.out.println("Write your choice ");
            Scanner oScanner = new Scanner(System.in);
            String sLine =oScanner.nextLine();
            switch(sLine)
                {
                  case "paper": ePlayer_1 = RPSG.paper; 
                           break;
                  case "rock": ePlayer_1 = RPSG.rock; 
                           break;
                  case "sessors": ePlayer_1 = RPSG.sessors; 
                           break;
                  case "exit": bVal=false; 
                           break;
                  default: System.out.println("Wrong inpute");
                           System.out.println("Players 1 wins number: "+nPlayer_1_win);
                           System.out.println("Players 2 wins number: "+nPlayer_2_win);
                           System.out.println("Number of ties: "+nTies);
                }
                Random objRandom = new Random();
                int nRundom = objRandom.nextInt(3);
                switch(nRundom)
                {
                  case 0: ePlayer_2 = RPSG.paper; 
                           break;
                  case 1: ePlayer_2 = RPSG.rock; 
                           break;
                  case 2: ePlayer_2 = RPSG.sessors; 
                           break;
                  default: System.out.println("error");
                           break;
                }
            

                if (ePlayer_1 == RPSG.paper)
                {
                    if (ePlayer_2 == RPSG.rock)
                    {
                        nPlayer_1_win++;
                        System.out.println("Player 1 win");
                        System.out.println("Players 1 wins number: "+nPlayer_1_win);
                        System.out.println("Players 2 wins number: "+nPlayer_2_win);
                        System.out.println("Number of ties: "+nTies);
                    }
                     else if(ePlayer_2 == RPSG.sessors)
                    {
                        nPlayer_2_win++;
                        System.out.println("Player 2 win");
                        System.out.println("Players 1 wins number: "+nPlayer_1_win);
                        System.out.println("Players 2 wins number: "+nPlayer_2_win);
                        System.out.println("Number of ties: "+nTies);
                    }
                      else if(ePlayer_2 == RPSG.rock)
                    {
                        nTies++;
                        System.out.println("Tie");
                        System.out.println("Players 1 wins number: "+nPlayer_1_win);
                        System.out.println("Players 2 wins number: "+nPlayer_2_win);
                        System.out.println("Number of ties: "+nTies);
                    }

                }
                else if (ePlayer_1 == RPSG.sessors)
                {
                    if (ePlayer_2 == RPSG.rock)
                    {
                        nPlayer_2_win++;
                        System.out.println("Player 2 win");
                        System.out.println("Players 1 wins number: "+nPlayer_1_win);
                        System.out.println("Players 2 wins number: "+nPlayer_2_win);
                        System.out.println("Number of ties: "+nTies);
                    }
                     else if(ePlayer_2 == RPSG.paper)
                    {
                        nPlayer_1_win++;
                        System.out.println("Player 1 win");
                        System.out.println("Players 1 wins number: "+nPlayer_1_win);
                        System.out.println("Players 2 wins number: "+nPlayer_2_win);
                        System.out.println("Number of ties: "+nTies);
                    }
                      else if(ePlayer_2 == RPSG.sessors)
                    {
                        nTies++;
                        System.out.println("Tie");
                        System.out.println("Players 1 wins number: "+nPlayer_1_win);
                        System.out.println("Players 2 wins number: "+nPlayer_2_win);
                        System.out.println("Number of ties: "+nTies);
                    }
                }
                else if (ePlayer_1 == RPSG.rock)
                {
                    if (ePlayer_2 == RPSG.paper)
                    {
                        nPlayer_1_win++;
                        System.out.println("Player 1 win");
                        System.out.println("Players 1 wins number: "+nPlayer_1_win);
                        System.out.println("Players 2 wins number: "+nPlayer_2_win);
                        System.out.println("Number of ties: "+nTies);
                    }
                     else if(ePlayer_2 == RPSG.sessors)
                    {
                        nPlayer_2_win++;
                        System.out.println("Player 2 win");
                        System.out.println("Players 1 wins number: "+nPlayer_1_win);
                        System.out.println("Players 2 wins number: "+nPlayer_2_win);
                        System.out.println("Number of ties: "+nTies);
                    }
                      else if(ePlayer_2 == RPSG.rock)
                    {
                        nTies++;
                        System.out.println("Tie");
                        System.out.println("Players 1 wins number: "+nPlayer_1_win);
                        System.out.println("Players 2 wins number: "+nPlayer_2_win);
                        System.out.println("Number of ties: "+nTies);
                    }
                }
        }
    }
  
}
