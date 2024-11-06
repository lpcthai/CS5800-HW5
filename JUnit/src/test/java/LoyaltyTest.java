import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class LoyaltyTest {

    @Test
    public void testGoldLoyaltyDiscount() {
        Loyalty goldLoyalty = new Loyalty("Gold");
        double total = 100.0;
        assertEquals(90.0, goldLoyalty.applyDiscount(total));
    }
    @Test
    public void testSilverLoyaltyDiscount() {
        Loyalty silverLoyalty = new Loyalty("Silver");
        double total = 100.0;
        assertEquals(95.0, silverLoyalty.applyDiscount(total));
    }
    @Test
    public void testNoLoyaltyDiscount() {
        Loyalty noLoyalty = new Loyalty("Bronze");
        double total = 100.0;
        assertEquals(100, noLoyalty.applyDiscount(total), "No loyalty should apply no discount.");
    }
}
