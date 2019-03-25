package FactoryPattern.PizzaStoreExample.Product;

public abstract class Pizza {
    String name;
    void prepare(){
        System.out.println("preparing "+ name);
    }
    public String getName(){
        return name;
    }
}
