import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerOrderTest {

    @Test
    public void testCalculateTotalCost() {
        CustomerOrder order = new CustomerOrder();
        FoodItem burger = new Burger();
        FoodItem fries = new Fries();
        order.addItem(burger);
        order.addItem(fries);

        assertEquals(7.5, order.calculateTotalCost());
    }

    @Test
    public void testAddItem() {
        CustomerOrder order = new CustomerOrder();
        FoodItem burger = new Burger();
        order.addItem(burger);

        assertEquals(1, order.getItems().size());
    }
}
