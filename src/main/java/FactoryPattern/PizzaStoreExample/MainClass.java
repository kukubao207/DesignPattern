package FactoryPattern.PizzaStoreExample;

import FactoryPattern.PizzaStoreExample.Creater.NewYorkPizzaStore;
import FactoryPattern.PizzaStoreExample.Creater.PizzaStore;
import FactoryPattern.PizzaStoreExample.Product.Pizza;

public class MainClass {
    public static void main(String[] args){
        PizzaStore pizzaStore = new NewYorkPizzaStore();
        Pizza pizza = pizzaStore.createPizza("new york");
        System.out.println(pizza.getName());
    }
}
