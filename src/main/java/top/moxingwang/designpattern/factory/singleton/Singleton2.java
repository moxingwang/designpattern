package top.moxingwang.designpattern.factory.singleton;

/**
 * 饿汉模式
 */
public class Singleton2 {
    private static Singleton2 singleton = new Singleton2();

    private Singleton2() {
    }

    public Singleton2 getInstance(){
        return singleton;
    }
}
