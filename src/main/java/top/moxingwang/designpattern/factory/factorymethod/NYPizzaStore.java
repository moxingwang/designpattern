package top.moxingwang.designpattern.factory.factorymethod;


public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String type) {
       Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new NYCheesePizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new NYPepperoniPizza();
        }


        return pizza;
    }
}
