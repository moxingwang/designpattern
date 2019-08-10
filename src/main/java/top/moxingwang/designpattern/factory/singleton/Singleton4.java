package top.moxingwang.designpattern.factory.singleton;

/**
 * 静态内部类
 */
public class Singleton4 {
    private Singleton4() {

    }

    public static Singleton4 getSingleton() {
        return SingletonHelper.singleton4;
    }

    private static class SingletonHelper {
        private static final Singleton4 singleton4 = new Singleton4();
    }
}
