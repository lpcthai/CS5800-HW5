public class Main {
    public static void main(String[] args) {
        FoodItem burger = new Cheese(new Bacon(new Burger())); // Create food items with toppings
        FoodItem fries1 = new Fries();
        CustomerOrder order = new CustomerOrder();   // Create customer order and add items
        order.addItem(burger);
        order.addItem(fries1);
        order.displayOrder();    // Display the order and total cost
        Loyalty SilverStatus= new Loyalty("Silver");
        double discount= SilverStatus.applyDiscount(order.calculateTotalCost());
        System.out.println("Your status is: " + SilverStatus.loyaltyStatus);
        System.out.println( "Your total after the discount is: $" + discount + "\n");

        FoodItem hotdog= new Veggies(new HotDog());
        FoodItem fries2 = new Cheese(new Fries());
        CustomerOrder order2 = new CustomerOrder();
        order2.addItem(hotdog);
        order2.addItem(fries2);
        order2.displayOrder();
        Loyalty noneStatus= new Loyalty("none");
        double discount2= noneStatus.applyDiscount(order2.calculateTotalCost());
        System.out.println("Your status is: " + noneStatus.loyaltyStatus);
        System.out.println( "Your total after the discount is: $" + discount2 + "\n");

        FoodItem hotdog3 = new HotDog();
        FoodItem fries3 = new Fries();
        FoodItem burger3 = new Sausage(new Burger());
        CustomerOrder order3 = new CustomerOrder();
        order3.addItem(hotdog3);
        order3.addItem(fries3);
        order3.addItem(burger3);
        order3.displayOrder();
        Loyalty GoldStatus= new Loyalty("Gold");
        double discount3 = GoldStatus.applyDiscount(order3.calculateTotalCost());
        System.out.println("Your status is: " + GoldStatus.loyaltyStatus);
        System.out.println("Your total after the discount is: $" + discount3 + "\n");
    }
}
