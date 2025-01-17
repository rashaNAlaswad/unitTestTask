import org.example.MathOperations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathOperationsTest {

    @Test
    void testGcd() {
        assertEquals(4, MathOperations.gcd(12, 8));
        assertEquals(1, MathOperations.gcd(17, 13));
    }

    @Test
    void testIsPrime() {
        assertTrue(MathOperations.isPrime(17));
        assertFalse(MathOperations.isPrime(15));
    }

    @Test
    void testFactorial() {
        assertEquals(1, MathOperations.factorial(0));
        assertEquals(120, MathOperations.factorial(5));
        assertThrows(IllegalArgumentException.class, () -> MathOperations.factorial(-1));
    }
}