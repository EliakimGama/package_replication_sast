//  Technique: FEW SHOT CHAIN OF THOUGHT
//  Template: For generating <tool or test type> test cases follow these steps: <reasoning steps> Following these steps for the <target> generate the <test type> tests
//  Example: For generating JUnit Test cases follow these steps:
// Step 1: Analyze the functions of the Calculator class and create a unit test for each function considering success and failure cases.
// Step 2: Review the test code. Verify that the test cases make logical sense, cover an adequate range of input scenarios, and effectively test the expected behavior of the class.
// Step 3: Verify if the needed imports were included in the code.
// Following these steps for the Calculator, generate Java unit tests.

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(5.0, calculator.addition(2, 3), 0.001);
        assertEquals(-1.0, calculator.addition(-2, 1), 0.001);
        assertEquals(0.0, calculator.addition(2, -2), 0.001);
    }

    @Test
    public void testSubtraction() {
        assertEquals(-1.0, calculator.subtraction(2, 3), 0.001);
        assertEquals(-3.0, calculator.subtraction(-2, 1), 0.001);
        assertEquals(4.0, calculator.subtraction(2, -2), 0.001);
    }

    @Test
    public void testMultiplication() {
        assertEquals(6.0, calculator.multiplication(2, 3), 0.001);
        assertEquals(-2.0, calculator.multiplication(-2, 1), 0.001);
        assertEquals(-4.0, calculator.multiplication(2, -2), 0.001);
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calculator.division(6, 3), 0.001);
        assertEquals(-2.0, calculator.division(-4, 2), 0.001);
        assertEquals(-1.0, calculator.division(2, -2), 0.001);
    }

    @Test
    public void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.division(1, 0);
        });
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}