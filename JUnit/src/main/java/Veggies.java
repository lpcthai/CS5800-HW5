public class Veggies extends ToppingDecorator {
    public Veggies(FoodItem decoratedFoodItem) {
        super(decoratedFoodItem);
    }

    @Override
    public double cost() {
        return decoratedFoodItem.cost()+ 1.0; //added $1 for veggies
    }

    @Override
    public String description() {
        return decoratedFoodItem.description() + ", Veggies";
    }
}

