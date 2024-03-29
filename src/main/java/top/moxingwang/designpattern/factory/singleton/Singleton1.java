package top.moxingwang.designpattern.factory.singleton;

/**
 * 懒汉模式
 */
public class Singleton1 {

    private static Singleton1 instance = null;
    private Singleton1() {
    }

    public synchronized Singleton1 getInstance() {
        if (null == instance) {
            instance = new Singleton1();
        }

        return instance; 
    }
}
