import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class BaconTest {
    @Test
    public void testCost() {
        FoodItem burger = new Burger();
        FoodItem baconBurger = new Bacon(burger);
        assertEquals(6.00, baconBurger.cost());
    }

    @Test
    public void testDescription() {
        FoodItem burger = new Burger();
        FoodItem baconBurger = new Bacon(burger);
        assertEquals("Burger, Bacon", baconBurger.description());
    }
}
