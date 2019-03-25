package FactoryPattern.PizzaStoreExample.Creater;

import FactoryPattern.PizzaStoreExample.Product.Pizza;

public abstract class PizzaStore {

    public abstract Pizza createPizza(String type);

}
