
package datasize;


public class DataSize {

    
    public static long getMemmory()
    {
        Runtime obRuntime =Runtime.getRuntime();
        long lTotal = obRuntime.totalMemory();
        long lFreeMemory =obRuntime.freeMemory();
       
        long lUsed = lTotal - lFreeMemory;
        return lUsed;
    
    }

    public static void main(String[] args) 
    {
        System.out.println("Byte.SIZE:"+ Byte.SIZE);
        System.out.println("Byte.BYTES:"+ Byte.BYTES);
        
        System.out.println("Integer.SIZE:"+ Integer.SIZE);
        System.out.println("Byte.BYTES:"+ Integer.BYTES);
        
        System.out.println("Long.SIZE:"+ Long.SIZE);
        System.out.println("Long.BYTES:"+ Long.BYTES);
        
        System.out.println("Float.SIZE:"+ Float.SIZE);
        System.out.println("Float.BYTES:"+ Float.BYTES);
        
        System.out.println(" Short.SIZE:"+ Short.SIZE);
        System.out.println(" Short.BYTES:"+  Short.BYTES);
        
        System.out.println("Double.SIZE:"+ Double.SIZE);
        System.out.println("Double.BYTES:"+ Double.BYTES);
        
        System.out.println(" Character.SIZE:"+ Character.SIZE);
        System.out.println(" Character.BYTES:"+  Character.BYTES);
        
        
        
        long lMemoryBefore= getMemmory();
        Boolean bNew = new Boolean(false); 
        System.gc();
        long lMemoryAfer= getMemmory();

        long lMemmory = lMemoryBefore -lMemoryAfer;
        
        System.out.println("boolean size : "+lMemmory);
        
    }
    
}
