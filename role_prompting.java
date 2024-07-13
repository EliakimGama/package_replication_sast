//  Technique: ROLE PROMPTING
//  Template: You are a <Role> in creating <tool or testing type> tests. Create these tests for <target>
//  Example: You are a developer experienced in creating unit tests with JUnit. Create these tests for the Calculator

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        assertEquals(5, Calculator.addition(2, 3));
        assertEquals(0, Calculator.addition(-1, 1));
        assertEquals(-3, Calculator.addition(-1, -2));
    }

    @Test
    public void testSubtraction() {
        assertEquals(1, Calculator.subtraction(3, 2));
        assertEquals(-2, Calculator.subtraction(-1, 1));
        assertEquals(1, Calculator.subtraction(-1, -2));
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, Calculator.multiplication(2, 3));
        assertEquals(-1, Calculator.multiplication(-1, 1));
        assertEquals(2, Calculator.multiplication(-1, -2));
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, Calculator.division(6, 3));
        assertEquals(-1.0, Calculator.division(-1, 1));
        assertEquals(0.5, Calculator.division(1, 2));
        
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Calculator.division(1, 0);
        });
        
        assertEquals("Error: Division by zero is not allowed.", exception.getMessage());
    }
}