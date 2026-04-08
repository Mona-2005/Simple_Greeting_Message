import static org.junit.Assert.*;
import org.junit.Test;

public class GreetingAPITest {

    @Test
    public void testGreeting() {
        String result = GreetingAPI.getGreeting("Praveen");
        assertEquals("Hello, Praveen! Welcome!", result);
    }
}
