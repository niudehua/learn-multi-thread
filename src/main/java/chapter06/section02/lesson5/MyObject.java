package chapter06.section02.lesson5;

/**
 * @author: deng
 * @datetime: 2020/6/2 3:39 下午
 * @desc: 针对某些重要的代码块进行同步
 */
public class MyObject {
    private static MyObject myObject;

    private MyObject() {
    }

    public static MyObject getInstance() {
        try {
            if (myObject == null) {
                // 模拟在创建对象之前做一些准备性的工作
                Thread.sleep(3000);
                // 使用synchronized (MyObject.class)
                // 虽然部分代码被上锁
                // 但还是有非线程安全问题
                synchronized (MyObject.class) {
                    myObject = new MyObject();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }

}

