package DecoratorPattern.DrinkExample;

public abstract class Drink {
    String description = "Unknown drink";
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
