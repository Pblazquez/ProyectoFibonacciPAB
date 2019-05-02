package org.uma.pep;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    Fibonacci fibonacci;

    @Before
    public void setup() {
        fibonacci = new Fibonacci();
    }

    @After
    public void after() {
        fibonacci = null;
    }

    @Test
    public void shouldFibonacciNumber1Pair3Return1() {
        int expectedResult = 1;
        int obtainedResult = fibonacci.compute(1,3);

        assertEquals(expectedResult, obtainedResult);
    }

    @Test
    public void shouldFibonacciNumber2Pair3Return1() {
        int expectedResult = 1;
        int obtainedResult = fibonacci.compute(2, 3);

        assertEquals(expectedResult, obtainedResult);
    }

    @Test
    public void shouldFibonacciNumber3Pair3Return4() {
        int expectedResult = 4;
        int obtainedResult = fibonacci.compute(3,3);

        assertEquals(expectedResult, obtainedResult);
    }

    @Test
    public void shouldFibonacciNumber4Pair3Return7() {
        int expectedResult = 7;
        int obtainedResult = fibonacci.compute(4, 3);

        assertEquals(expectedResult, obtainedResult);
    }

    @Test
    public void shouldFibonacciNumber5Pair3Return19() {
        int expectedResult = 19;
        int obtainedResult = fibonacci.compute(5, 3);

        assertEquals(expectedResult, obtainedResult);
    }

    @Test
    public void shouldFibonacciNumber6Pair3Return40() {
        int expectedResult = 40;
        int obtainedResult = fibonacci.compute(6, 3);

        assertEquals(expectedResult, obtainedResult);
    }
    @Test
    public void shouldFibonacciNumber7Pair3Return97() {
        int expectedResult = 97;
        int obtainedResult = fibonacci.compute(7, 3);

        assertEquals(expectedResult, obtainedResult);
    }

    @Test(expected = RuntimeException.class)
    public void shouldFactorialThrowsAnExceptionIfTheValueIsNegative() {
        fibonacci.compute(-2, 3);
    }
}
