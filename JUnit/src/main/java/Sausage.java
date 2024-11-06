public class Sausage extends ToppingDecorator {
    public Sausage(FoodItem decoratedFoodItem) {
        super(decoratedFoodItem);
    }

    @Override
    public double cost() {
        return decoratedFoodItem.cost()+ 1.25; //added $1.25  for sausage
    }

    @Override
    public String description() {
        return decoratedFoodItem.description() + ", Sausage";
    }
}
