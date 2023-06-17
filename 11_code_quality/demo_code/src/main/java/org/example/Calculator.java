package org.example;

/**
 * @author albina-gima
 * @date 4/5/23
 */
public class Calculator {
    public int add(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Function arguments must not be null!");
        }
        return a + b;
    }

    /**
     * Method subtracts b from a.
     *
     * @param a param
     * @param b param
     * @return result
     */
    public int subtract(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Function arguments must not be null!");
        }
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
