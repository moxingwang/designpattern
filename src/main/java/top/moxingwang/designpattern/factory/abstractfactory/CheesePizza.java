package top.moxingwang.designpattern.factory.abstractfactory;

public class CheesePizza extends Pizza{
    private PizzaIngredientFactory factory;

    public CheesePizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    public void prepare() {
       this.dough =  factory.createDough();
       this.sauce =  factory.createSauce();
    }
}
