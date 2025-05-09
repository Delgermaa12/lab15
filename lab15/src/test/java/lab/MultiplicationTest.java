package lab;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MultiplicationTest {
    @Test
    public void testMultiplyPositive() {
        Multiplication multiplication = new Multiplication();
        double result = multiplication.multiply(2.0, 3.0);
        assertEquals(6.0, result, "Multiplication result should be 6.0");
    }

    @Test
    public void testMultiplyNegative() {
        Multiplication multiplication = new Multiplication();
        double result = multiplication.multiply(-2.0, 3.0);
        assertEquals(-6.0, result, "Multiplication result should be -6.0");
    }
}
