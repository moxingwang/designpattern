package top.moxingwang.designpattern.factory.factorymethod;

public class ChinaPizzaStore extends PizzaStore {
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new ChineseCheesePizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new ChinesePepperoniPizza();
        }


        return pizza;
    }
}
