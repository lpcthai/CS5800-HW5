public abstract class ToppingDecorator implements FoodItem {
    protected FoodItem decoratedFoodItem;

    public ToppingDecorator(FoodItem ToppingDecoration) {
        this.decoratedFoodItem = ToppingDecoration;
    }

    public String description() {
        return decoratedFoodItem.description();
    }

    public double cost() {
        return decoratedFoodItem.cost();
    }
}
