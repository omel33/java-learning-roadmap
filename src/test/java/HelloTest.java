import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @Test
    void shouldThrowExceptionIfNameIsNull() {
        assertThrows(IllegalArgumentException.class, () -> basics01.Hello.greet(null));
    }

    @Test
    void shouldThrowExceptionIfNameIsBlank() {
        assertThrows(IllegalArgumentException.class, () -> basics01.Hello.greet("   "));
    }

    @Test
    void shouldReturnGreeting() {
        assertEquals("Hello, World!", basics01.Hello.greet("world"));
    }
}
