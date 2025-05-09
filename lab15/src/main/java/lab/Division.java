package lab;

/**
 * The Division class provides a method to divide two numbers.
 */
public final class Division {

    /**
     * Divides the first number by the second.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the result of division
     * @throws IllegalArgumentException if b is zero
     */
    public double divide(final double a, final double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return a / b;
    }
}
