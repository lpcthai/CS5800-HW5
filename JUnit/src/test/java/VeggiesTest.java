import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class VeggiesTest {
    @Test
    public void testCost() {
        FoodItem hotdog = new HotDog(); //3.50;
        FoodItem veggies = new Veggies(hotdog);
        assertEquals(4.50, veggies.cost());
    }
    @Test
    public void testDescription() {
        FoodItem hotdog = new HotDog(); //3.50;
        FoodItem veggies = new Veggies(hotdog);
        assertEquals("HotDog, Veggies", veggies.description());
    }
}
