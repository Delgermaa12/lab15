package lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class DivisionTest {
    @Test
    public void testDividePositive() {
        Division division = new Division();
        double result = division.divide(6.0, 3.0);
        assertEquals(2.0, result, "Division result should be 2.0");
    }

    @Test
    public void testDivideByZero() {
        Division division = new Division();
        assertThrows(IllegalArgumentException.class, () -> division.divide(6.0, 0), "Should throw exception for division by zero");
    }

    @Test
void testDivideByZero11() {
    Division d = new Division();
    assertThrows(IllegalArgumentException.class, () -> d.divide(1.0, 0.0));
}

}
