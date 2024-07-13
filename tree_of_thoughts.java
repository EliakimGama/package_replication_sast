//  Technique: TREE OF THOUGHTS
//  Template: Imagine <number of profiles> different experts are generating <tool and/or testing type> unit tests for the <target>. All experts will write down 1 step of their thinking, then share it with the group. Then all experts will go on to the next step, etc. At the end, they compare the answers aiming to identify the different test cases. Then they merge the answers to provide a unique answer resulting in the best coverage and effective test suite.
//  Example: Imagine three different experts are answering the question for generating JUnit tests for the Calculator Class. All experts will write down 1 step of their thinking, then share it with the group. Then all experts will go on to the next step, etc. At the end, they compare the answers aiming to identify the different test cases. Then they merge the answers to provide a unique answer resulting in the best coverage and effective test suite

TESTE @Test
public void testAddition() {
    assertEquals(5, calculator.addition(2, 3));
    assertEquals(-1, calculator.addition(-2, 1));
    assertEquals(0, calculator.addition(0, 0));
}

@Test
public void testSubtraction() {
    assertEquals(1, calculator.subtraction(3, 2));
    assertEquals(-3, calculator.subtraction(-2, 1));
    assertEquals(0, calculator.subtraction(2, 2));
} @Test
public void testMultiplication() {
    assertEquals(6, calculator.multiplication(2, 3));
    assertEquals(0, calculator.multiplication(0, 10));
    assertEquals(-6, calculator.multiplication(-2, 3));
}

@Test
public void testDivision() {
    assertEquals(2, calculator.division(6, 3), 0.001);
    assertEquals(-2, calculator.division(-6, 3), 0.001);
    assertEquals("Erro: Divisão por zero não é permitida.", calculator.division(6, 0));
}@Test
public void testAdditionEdgeCases() {
    assertEquals(Integer.MAX_VALUE, calculator.addition(Integer.MAX_VALUE, 0));
    assertEquals(Integer.MIN_VALUE, calculator.addition(Integer.MIN_VALUE, 0));
}

@Test
public void testDivisionEdgeCases() {
    assertEquals(1, calculator.division(1, 1), 0.001);
    assertEquals(0.5, calculator.division(1, 2), 0.001);
}