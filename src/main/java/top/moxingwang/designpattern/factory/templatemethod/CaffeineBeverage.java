package top.moxingwang.designpattern.factory.templatemethod;

public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        ourInCup();
        addCondiments();
        hook();
    }

    //钩子
    protected void hook() {

    }


    protected abstract void brew();

    protected abstract void addCondiments();

    protected void ourInCup() {
        System.out.println("ourInCup");

    }


    protected void boilWater() {
        System.out.println("boilWater");
    }


}
