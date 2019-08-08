package top.moxingwang.designpattern.factory.abstractfactory;

public class ClamPizza extends Pizza{
    private PizzaIngredientFactory factory;

    public ClamPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    public void prepare() {
       this.dough =  factory.createDough();
       this.sauce =  factory.createSauce();
    }
}
