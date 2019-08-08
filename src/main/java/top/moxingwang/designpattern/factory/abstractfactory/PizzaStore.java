package top.moxingwang.designpattern.factory.abstractfactory;


public abstract class PizzaStore {
    protected abstract Pizza createPizza(String type);
}
