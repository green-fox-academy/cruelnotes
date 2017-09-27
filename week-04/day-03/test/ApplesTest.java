import org.junit.Test;
import static org.junit.Assert.*;

public class ApplesTest {

    String msg = "apples";
    Apples apples = new Apples();

    public ApplesTest() {
    }

    @Test
    public void testSoutApples() {
        assertEquals(msg, apples.getApple());
    }
}