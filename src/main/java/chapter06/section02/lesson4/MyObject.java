package chapter06.section02.lesson4;

/**
 * @author: deng
 * @datetime: 2020/6/2 3:39 下午
 * @desc: 尝试同步代码块
 */
public class MyObject {
    private static MyObject myObject;

    private MyObject() {
    }

    public static MyObject getInstance() {
        // 此方法等同于    synchronized public static MyObject getInstance() 的写法，效率一样底下
        synchronized (MyObject.class) {
            try {
                if (myObject == null) {
                    // 模拟在创建对象之前做一些准备性的工作
                    Thread.sleep(3000);
                    myObject = new MyObject();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        return myObject;
    }
}

