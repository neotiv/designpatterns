public class Main {
    public static void main(String[] args) {
        // Create a simple coffee
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost: " + simpleCoffee.cost() + ", Description: " + simpleCoffee.description());

        // Add milk to the coffee
        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println("Cost: " + milkCoffee.cost() + ", Description: " + milkCoffee.description());

        // Add sugar to the coffee
        Coffee sugarCoffee = new SugarDecorator(simpleCoffee);
        System.out.println("Cost: " + sugarCoffee.cost() + ", Description: " + sugarCoffee.description());

        // Combine both milk and sugar
        Coffee milkAndSugarCoffee = new SugarDecorator(new MilkDecorator(simpleCoffee));
        System.out.println("Cost: " + milkAndSugarCoffee.cost() + ", Description: " + milkAndSugarCoffee.description());
    }
}
