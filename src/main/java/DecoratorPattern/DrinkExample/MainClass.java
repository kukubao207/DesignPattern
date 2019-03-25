package DecoratorPattern.DrinkExample;

public class MainClass {
    public static void main(String[] args){
        Drink drink = new Milk();
        drink = new CondimentOne(drink);
        drink = new CondimentTwo(drink);
        System.out.println(drink.getDescription());
    }
}
