package DecoratorPattern.DrinkExample;

public class CondimentTwo extends CondimentDecorator{
    Drink drink;
    public CondimentTwo(Drink drink){
        this.drink = drink;
    }
    public String getDescription(){
        return drink.getDescription() + ", condiment two";
    }
    public double cost(){
        return drink.cost() + 1.8;
    }
}
