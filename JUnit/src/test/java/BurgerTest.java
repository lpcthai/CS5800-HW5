import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BurgerTest {
    @Test
    public void testCost() {
        Burger burger = new Burger();
        assertEquals(5.0, burger.cost());
    }

    @Test
    public void testDescription() {
        Burger burger = new Burger();
        assertEquals("Burger", burger.description());
    }
}
