//  Technique: QUESTION REFINEMENT
//  Template: Iteration one: Create a prompt for ChatGPT for generating <tool and/or testing type> tests for the <target> that generate the best set of tests for it. Iteration two: Use the prompt generated
//  Example: Iteration one: Create a prompt input for ChatGPT for generating JUnit tests for the Calculator Class. Iteration two: Use the prompt generated

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-1, 1));
        assertEquals(-5, calculator.add(-2, -3));
        assertEquals(2000000000, calculator.add(1000000000, 1000000000));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-2, calculator.subtract(-1, 1));
        assertEquals(1, calculator.subtract(-2, -3));
        assertEquals(0, calculator.subtract(1000000000, 1000000000));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-1, calculator.multiply(-1, 1));
        assertEquals(6, calculator.multiply(-2, -3));
        assertEquals(1000000000, calculator.multiply(1000000, 1000));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3), 0.0001);
        assertEquals(-1.0, calculator.divide(-1, 1), 0.0001);
        assertEquals(2.0, calculator.divide(-6, -3), 0.0001);
        assertEquals(1.0, calculator.divide(1000000, 1000000), 0.0001);
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(1, 0);
        });
        assertEquals("Divisor cannot be zero", exception.getMessage());
    }
}