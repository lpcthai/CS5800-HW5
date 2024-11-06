import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HotDogTest {

    @Test
    public void testCost() {
        HotDog hotDog = new HotDog();
        assertEquals(3.50, hotDog.cost());
    }

    @Test
    public void testDescription() {
        HotDog hotDog = new HotDog();
        assertEquals("HotDog", hotDog.description());
    }
}
