package chapter06.section03;

/**
 * @author: deng
 * @datetime: 2020/6/2 4:12 下午
 * @desc: 使用静态内置类实现单例模式
 */
public class MyObject {

    private static class MyObjectHandler {
        private static MyObject myObject = new MyObject();
    }

    private MyObject() {
    }

    public static MyObject getInstance() {
        return MyObjectHandler.myObject;
    }


}