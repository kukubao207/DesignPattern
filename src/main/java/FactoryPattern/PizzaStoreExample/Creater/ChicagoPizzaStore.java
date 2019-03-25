package FactoryPattern.PizzaStoreExample.Creater;

import FactoryPattern.PizzaStoreExample.Product.ChicagoPizza;
import FactoryPattern.PizzaStoreExample.Product.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String type){
        return new ChicagoPizza();
    }
}
