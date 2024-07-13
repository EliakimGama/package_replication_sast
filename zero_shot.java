//  Technique: ZERO SHOT
//  Template: Create <tool or testing type> tests for <target>
//  Example: Create JUnit tests for the Calculator

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        assertEquals(5, calculator.addition(2, 3));
        assertEquals(-1, calculator.addition(2, -3));
        assertEquals(0, calculator.addition(0, 0));
    }

    @Test
    public void testSubtraction() {
        assertEquals(1, calculator.subtraction(3, 2));
        assertEquals(5, calculator.subtraction(2, -3));
        assertEquals(0, calculator.subtraction(0, 0));
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, calculator.multiplication(2, 3));
        assertEquals(-6, calculator.multiplication(2, -3));
        assertEquals(0, calculator.multiplication(0, 5));
    }

    @Test
    public void testDivision() {
        assertEquals(2, calculator.division(6, 3));
        assertEquals(-2, calculator.division(6, -3));
        assertEquals(0, calculator.division(0, 1));
    }

    @Test
    public void testDivisionByZero() {
        assertEquals("Error: Division by zero is not allowed.", calculator.division(6, 0));
    }
}