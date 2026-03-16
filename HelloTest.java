import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloTest {
    @Test
    void testHello() {
        Hello h = new Hello();
        assertEquals("Hello, World!", h.hello());
    }
}

