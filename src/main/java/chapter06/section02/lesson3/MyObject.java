package chapter06.section02.lesson3;

/**
 * @author: deng
 * @datetime: 2020/6/2 3:39 下午
 * @desc: 延时加载/"懒汉模式"的解决方案
 */
public class MyObject {
    private static MyObject myObject;

    private MyObject() {
    }

    // 设置同步方法效率太低了
    // 整个方法被上锁
    synchronized public static MyObject getInstance() {
        try {
            if (myObject == null) {
                // 模拟在创建对象之前做一些准备性的工作
                Thread.sleep(3000);
                myObject = new MyObject();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}

