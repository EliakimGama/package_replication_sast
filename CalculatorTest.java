// Technique: CONTEXT MANAGER
// Template: Considering that this application is built in <language> and that this class is responsible for <class’ goal>, generate <testing type> tests in <tool> for it
// Example: Considering that this application is built in Java and that this class is responsible for calculating basic math operations such as subtraction, addition, multiplication, and division, generate unit tests in JUnit for it

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-2, 1));
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    public void testSubtraction() {
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-3, calculator.subtract(-2, 1));
        assertEquals(0, calculator.subtract(0, 0));
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-2, calculator.multiply(-2, 1));
        assertEquals(0, calculator.multiply(0, 5));
    }

    @Test
    public void testDivision() {
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(-2, calculator.divide(-4, 2));
        
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(1, 0);
        });

        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}