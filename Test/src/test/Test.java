/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author root
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       /* int nVal =0;
        while(nVal<256)
        {
            System.out.println("Value " + nVal + " Cahar "+ (char)nVal );
            nVal++;
       
        }
        if(!(a==b)){}
       boolean b=false;
        /*String[] sLine = new String[] { "2", "1", "+", "3", "*" };
        
        
		for (String t :sLine) 
                {
                   // System.out.println(t);
                
                }*/
      /*  char [] cLine = new char[5];
        int[] iLine = new int[] {2,1,3};
        
        
		for (int x :iLine) 
                {
                    System.err.println(x);
                
                }
       */ 
       boolean a=false;
       boolean b=false;
       String strVal="";
       
       strVal=(a?(b?"yes":"no"):"maybe");
       System.out.println(strVal);
       
       if(a)
       {
          if(b)
          { 
              strVal="yas";
          }
          else
          { 
              strVal ="no";
          }
       }
       else
       {
           strVal="maybe";
       }
       System.out.println(strVal);
       //StrVal=(n,(b,"yes":"no"):"maybe");
    
    
         if(a)
       {
          if(b)
          { 
              strVal="yas";
          }
          else
          { 
              strVal ="no";
          }
       }
         else
         {
             strVal="no";
         }
         
         
         strVal=(a&&b?"yes":"no");
         System.out.println(strVal);
         
         
         
        int x = Math.abs(100 - 110);
        System.out.println(x);
    }
    
}