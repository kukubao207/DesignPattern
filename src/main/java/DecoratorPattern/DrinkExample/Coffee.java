package DecoratorPattern.DrinkExample;

public class Coffee extends Drink {
    public Coffee(){
        description = "coffee";
    }
    public double cost(){
        return 7.0;
    }
}
