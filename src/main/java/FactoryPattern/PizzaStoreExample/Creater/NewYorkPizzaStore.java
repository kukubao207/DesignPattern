package FactoryPattern.PizzaStoreExample.Creater;

import FactoryPattern.PizzaStoreExample.Product.NewYorkPizza;
import FactoryPattern.PizzaStoreExample.Product.Pizza;

public class NewYorkPizzaStore extends PizzaStore {
    public Pizza createPizza(String type){
        return new NewYorkPizza();
    }
}
