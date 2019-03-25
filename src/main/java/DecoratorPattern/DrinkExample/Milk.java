package DecoratorPattern.DrinkExample;

public class Milk extends Drink {
    public Milk(){
        description = "Milk";
    }
    public double cost(){
        return 1.50;
    }
}
