import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MediTrackTest {

    @Test
    void testGreeting() {
        String message = MediTrack.greet();
        assertEquals("Hello from MediTrack!", message);
    }
}
