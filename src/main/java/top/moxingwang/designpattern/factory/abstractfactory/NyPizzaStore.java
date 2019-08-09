package top.moxingwang.designpattern.factory.abstractfactory;

public class NyPizzaStore extends PizzaStore {
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NyPizzaIngredientFactory();

        if ("cheese".equals(type)) {
            pizza = new CheesePizza(ingredientFactory);
        } else if ("ny".equals(type)) {
            pizza = new NYPizza(ingredientFactory);
        }

        return pizza;
    }
}
