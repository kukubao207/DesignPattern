package AdapterPattern;

public class Main {
    public static void main(String[] args){
        MallardDuck duck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        testDuck(duck);
        testDuck(turkeyAdapter);

    }
    public static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
