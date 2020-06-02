package chapter06.section02.lesson1;

/**
 * @author: deng
 * @datetime: 2020/6/2 3:23 下午
 * @desc: 延时加载/懒汉模式 解析
 */
public class MyObject {
    private static MyObject myObject;

    public MyObject() {
    }

    public static MyObject getInstance() {
        // 延时加载
        if (myObject == null) {
            return new MyObject();
        }
        return myObject;
    }
}
