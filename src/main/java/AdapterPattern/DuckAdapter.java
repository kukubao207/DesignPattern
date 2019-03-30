package AdapterPattern;

public class DuckAdapter implements Turkey {
    private Duck duck;
    public void gobble(){
        duck.quack();
    }
    public void fly(){
        duck.fly();
    }
}
