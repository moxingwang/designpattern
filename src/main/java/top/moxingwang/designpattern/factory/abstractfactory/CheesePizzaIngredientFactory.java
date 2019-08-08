package top.moxingwang.designpattern.factory.abstractfactory;

public class CheesePizzaIngredientFactory implements PizzaIngredientFactory {
    public String createDough() {
        return "cheese Dough";
    }

    public String createSauce() {
        return "cheese Sauce";
    }
}
