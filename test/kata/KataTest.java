package kata;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alfred Johnson II
 */
public class KataTest {
    
    public KataTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }


    /**
     * Test of displayFooBar method, of class Kata.
     */
    @Test
    public void testDisplayFooBar() {
        System.out.println("* foobarJUnitTest : testdisplayFooBar()");
        assertEquals("Foo", Kata.displayFooBar(3));
        assertEquals("Bar", Kata.displayFooBar(5));
        assertEquals("Bar", Kata.displayFooBar(10));
        assertEquals("FooBar", Kata.displayFooBar(15));
        assertEquals("FooBar", Kata.displayFooBar(45));
        assertEquals("The number is 14", Kata.displayFooBar(14));
        assertEquals("The number is 22", Kata.displayFooBar(22));
    }
    
}
