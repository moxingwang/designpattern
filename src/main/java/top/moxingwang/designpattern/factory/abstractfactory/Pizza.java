package top.moxingwang.designpattern.factory.abstractfactory;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;

    public abstract void prepare();

     void bake(){
        System.out.println("bake for 30 minutes");
    }
     void cut(){
        System.out.println("cutting the pizza");
    }
     void box(){
        System.out.println("box the pizza");
    }
}
