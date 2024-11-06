import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class CheeseTest {
    @Test
    public void testCost() {
        FoodItem burger = new Burger();
        FoodItem cheeseBurger = new Cheese(burger);
        assertEquals(6.00, cheeseBurger.cost());
    }
    @Test
    public void testDescription() {
        FoodItem burger = new Burger();
        FoodItem cheeseBurger = new Cheese(burger);
        assertEquals("Burger, Cheese", cheeseBurger.description());
    }
}
