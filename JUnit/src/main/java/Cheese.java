public class Cheese extends ToppingDecorator {
    public Cheese(FoodItem decoratedFoodItem) {
        super(decoratedFoodItem);
    }

    @Override
    public double cost() {
        return decoratedFoodItem.cost() + 1.0;
    }

    @Override
    public String description() {
        return decoratedFoodItem.description() + ", Cheese";
    }
}