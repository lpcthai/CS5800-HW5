import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SausageTest {
    @Test
    public void testCost() {
        FoodItem burger = new Burger();
        FoodItem sausageBurger = new Sausage(burger);
        assertEquals(6.25, sausageBurger.cost());
    }
    @Test
    public void testDescription() {
        FoodItem burger = new Burger();
        FoodItem sausageBurger = new Sausage(burger);
        assertEquals("Burger, Sausage", sausageBurger.description());
    }
}

