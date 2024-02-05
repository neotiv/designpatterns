// Concrete Component
public class SimpleCoffee implements Coffee {
    @Override
    public double cost() {
        return 2.0;  // Cost of a simple coffee
    }

    @Override
    public String description() {
        return "Simple Coffee";  // Description of a simple coffee
    }
}
