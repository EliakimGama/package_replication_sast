// Technique: FEW SHOT
// Template: Create <test type> tests for the <target> based on the following test: <example of test>
// Example: Create unit tests for the Calculator Java class based on the following test:

public void testMinus() { 
    Calculadora calculadora = new Calculadora(); 
    int resultado = calculadora.subtrair(5, 3); 
    assertEquals(2, resultado, "5 - 3 deve ser 2"); 
}

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        assertEquals(8, result, "5 + 3 should be 8");
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(5, 3);
        assertEquals(2, result, "5 - 3 should be 2");
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(5, 3);
        assertEquals(15, result, "5 * 3 should be 15");
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(6, 3);
        assertEquals(2.0, result, "6 / 3 should be 2.0");
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(6, 0);
        }, "Division by zero should throw IllegalArgumentException");
    }
}