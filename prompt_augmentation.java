//  Technique: PROMPT AUGMENTATION
//  Template: A good <tool and/or testing type> test should address the following characteristics: <expected characteristics> Based on these characteristics create <testing type> tests for the <target>
//  Example: A good unit test should address the following characteristics:
// 1. Fast Execution: Tests should run quickly to support rapid iterations and feedback during development. Jest runs tests in parallel and caches transformations to achieve faster test runs, but test design also affects speed.
// 2. Isolation: Unit tests should test functionality in isolation without relying on external systems or states. This means mocking dependencies like databases, APIs, or complex internal modules to ensure the unit under test is the focus.
// 3. Determinism: Tests should be deterministic, producing the same results every time they are run under the same conditions. Flakiness, where tests pass or fail unpredictably, should be avoided.
// 4. Readability: Code within tests should be clear and concise, making it easy for other developers (or future you) to understand the purpose of the test and the functionality being tested. Descriptive test names and well-structured test suites help achieve this.
// 5. Comprehensive: A good test suite covers all critical paths through the code, including success paths, failure paths, and edge cases. Coverage tools can help identify untested parts of your codebase, but coverage alone doesn't guarantee quality tests.
// Based on these characteristics, create JUnit tests for the Calculator Class

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-2, 1));
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-3, calculator.subtract(-2, 1));
        assertEquals(0, calculator.subtract(0, 0));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-2, calculator.multiply(-1, 2));
        assertEquals(0, calculator.multiply(0, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3));
        assertEquals(-2.5, calculator.divide(-5, 2));
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(1, 0);
        });
    }

    @Test
    public void testDivideEdgeCases() {
        assertEquals(0.0, calculator.divide(0, 1));
        assertEquals(0.0, calculator.divide(0, -1));
    }
}