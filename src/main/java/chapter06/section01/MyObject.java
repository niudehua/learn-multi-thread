package chapter06.section01;

/**
 * @author: deng
 * @datetime: 2020/6/2 3:23 下午
 * @desc: 立即加载/饿汉模式
 */
public class MyObject {
    // 立即加载，饿汉模式
    private static MyObject myObject = new MyObject();

    public MyObject() {
    }

    public static MyObject getInstance() {
        // 此代码版本为立即加载
        // 此版本代码的缺点是不能有其它实例变量
        // 因为getInstance()方法没有同步
        // 所以有可能出现非线程安全问题
        return myObject;
    }
}
