package top.moxingwang.designpattern.factory.abstractfactory;

public class NYPizza extends Pizza{
    private PizzaIngredientFactory factory;

    public NYPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    public void prepare() {
       this.dough =  factory.createDough();
       this.sauce =  factory.createSauce();
    }
}
