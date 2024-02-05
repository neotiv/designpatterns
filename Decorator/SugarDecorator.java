// Concrete Decorator 2
public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.5;  // Cost of sugar
    }

    @Override
    public String description() {
        return super.description() + ", with Sugar";  // Description with sugar
    }
}
