import org.example.basics01.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void shouldAddNumbers() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    void shouldSubNumbers() {
        assertEquals(1, Calculator.sub(3, 2));
    }

    @Test
    void shouldMulNumbers() {
        assertEquals(6, Calculator.mul(2, 3));
    }

    @Test
    void shouldThrowExceptionOnDivByZero() {
        assertThrows(ArithmeticException.class, () -> Calculator.div(5, 0));
    }
}