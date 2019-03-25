package DecoratorPattern.DrinkExample;

public class CondimentOne extends CondimentDecorator {
    Drink drink;
    public CondimentOne(Drink drink){
        this.drink = drink;
    }
    public String getDescription(){
        return drink.getDescription() + ", condiment one";
    }
    public double cost(){
        return drink.cost() + 0.5;
    }
}
