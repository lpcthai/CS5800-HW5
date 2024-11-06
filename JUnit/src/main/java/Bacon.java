// bacon topping decorate for burger
public class Bacon extends ToppingDecorator {
    public Bacon(FoodItem decoratedFoodItem) {
        super(decoratedFoodItem);
    }

    @Override
    public double cost() {
        return decoratedFoodItem.cost()+ 1.0; //added $1 for bacon
    }

    @Override
    public String description() {
        return decoratedFoodItem.description() + ", Bacon";
    }
}
