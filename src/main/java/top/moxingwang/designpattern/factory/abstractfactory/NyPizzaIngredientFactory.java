package top.moxingwang.designpattern.factory.abstractfactory;

public class NyPizzaIngredientFactory implements PizzaIngredientFactory {
    public String createDough() {
        return "ny Dough";
    }

    public String createSauce() {
        return "ny Sauce";
    }
}
