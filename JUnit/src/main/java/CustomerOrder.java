import java.util.ArrayList;
import java.util.List;

public class CustomerOrder {
    private List<FoodItem> items;

    public CustomerOrder() {
        this.items = new ArrayList<>();
    }


    public void addItem(FoodItem item) {
        items.add(item);
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (FoodItem item : items) {
            totalCost += item.cost();
        }
        return totalCost;
    }

    public List<FoodItem> getItems() {
        return items;
    }
    public void displayOrder() {
        System.out.println("Customer Order:");
        for (FoodItem item : items) {
            System.out.println("- " + item.description() + " : $" + item.cost());
        }
        System.out.println("Total Order Cost: $" + calculateTotalCost());
    }
}
