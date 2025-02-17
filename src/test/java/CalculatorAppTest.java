import org.example.CalculatorApp;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorAppTest {

    CalculatorApp cal = new CalculatorApp();
    
    //This test case tests the possible outcomes for the add method
    @Test
    void testAdd(){
        assertEquals(3,cal.add(1, 2));
        assertEquals(15,cal.add(1,2,3,4,5));
        assertEquals(-2,cal.add(-1,-1));
    }

    //This test case tests the possible outcomes for the multiply method
    @Test
    void testMultiply(){
        assertEquals(3,cal.multiply(3,1));
        assertEquals(-3,cal.multiply(-1,3));
        assertEquals(50,cal.multiply(-25,-2));
        assertEquals(120,cal.multiply(1,2,3,4,5));
    }

    //This test case tests the possible outcomes for the subtract method
    @Test
    void testSubtract(){
        assertEquals(7, cal.subtract(10, 3));
        assertEquals(60, cal.subtract(100, 30, 10));
        assertEquals(-10, cal.subtract(10, 20));
    }

    //This test case tests the possible outcomes for the divide method
    @Test
    void testDivide(){
        assertEquals(9, cal.divide(27,3));
        assertEquals(-10,cal.divide( -50,5));
        assertThrows(ArithmeticException.class, ()->cal.divide(64,0));
    }
}
