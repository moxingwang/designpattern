package top.moxingwang.designpattern.factory.simplefactory;


public class SimplePizzaFactory {
    public Pizza orderPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}
