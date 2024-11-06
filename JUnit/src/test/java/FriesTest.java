import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FriesTest {

    @Test
    public void testCost() {
        Fries fries = new Fries();
        assertEquals(2.50, fries.cost());
    }

    @Test
    public void testDescription() {
        Fries fries = new Fries();
        assertEquals("Fries", fries.description());
    }
}
