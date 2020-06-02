package chapter06.section05;

/**
 * @author: deng
 * @datetime: 2020/6/2 4:45 下午
 * @desc: 使用static代码块实现单例模式
 */
public class MyObject {
    private static MyObject instance = null;

    private MyObject() {
    }

    static {
        instance = new MyObject();
    }

    public static MyObject getInstance() {
        return instance;
    }
}
