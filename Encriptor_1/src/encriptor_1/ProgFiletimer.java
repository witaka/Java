package encriptor_1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenova
 */
public class ProgFiletimer 
{
    private final long MS_FACTOR =10000;
    private long m_lStartTime = 0; 
   
   public ProgFiletimer()
   {
      m_lStartTime = System.nanoTime();
   }
   
   public long elapsedTimeMS()
   {
     return  ((System.nanoTime()- m_lStartTime) / MS_FACTOR);
   }
   
   public void printElapsedTime()
   {
       System.out.println("ElapsedTime" + elapsedTimeMS()+"ms");
   }
}
