import org.example.basics01.Hello;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HelloTest {

    @Test
    void shouldThrowExceptionIfNameIsNull() {
      assertThrows(IllegalAccessException.class,()-> Hello.greet(null));
    }

    @Test
    void shouldThrowExceptionIfNameIsBlank() {
      assertThrows(IllegalAccessException.class,()-> Hello.greet(""));
    }
    @Test
    void shouldReturnGreeting(){
        assertEquals("Hello World", Hello.greet("World"));
    }

}
