public class Loyalty {
    public String loyaltyStatus;

    public Loyalty(String loyaltyStatus) {
        this.loyaltyStatus = loyaltyStatus;
    }

    public double applyDiscount(double total) {
        switch (loyaltyStatus) {
            case "Gold":
                return total * 0.90; // 10% discount
            case "Silver":
                return total * 0.95; // 5% discount
            default:
                return total; // No discount for others
        }
    }
}