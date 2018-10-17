
package pkg3_encriptor_oop;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class AdditiveTest {
    
    @Test
    public void testEncript() {
        Additive test = new Additive();
        String strData = "12345";
        String expResult = "54321";
        String result = test.encript(strData);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }


    @Test
    public void testDecrypt() {
        Additive test = new Additive();
        String strData = "54321";
        String expResult = "12345";
        String result = test.decrypt(strData);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    

}
