import org.example.MathOperations;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MathOperationsParameterizedTest {

    @ParameterizedTest
    @CsvSource({
            "12, 8, 4",
            "17, 13, 1",
            "18, 24, 6",
    })
    void testGcd(int a, int b, int expected) {
        assertEquals(expected, MathOperations.gcd(a, b));
    }

    @ParameterizedTest
    @CsvSource({
            "17, true",
            "1, false",
            "15, false",
    })
    void testIsPrime(int number, boolean expected) {
        assertEquals(expected, MathOperations.isPrime(number));
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 1",
            "5, 120",
            "-1, Factorial is not defined for negative numbers.",
            "-5, Factorial is not defined for negative numbers."
    })
    void testFactorial(int number, String expected) {
        if (number < 0) {
            Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                MathOperations.factorial(number);
            });
            assertEquals(expected, exception.getMessage());
        } else {
            int result = MathOperations.factorial(number);
            assertEquals(Integer.parseInt(expected), result);
        }
    }
}