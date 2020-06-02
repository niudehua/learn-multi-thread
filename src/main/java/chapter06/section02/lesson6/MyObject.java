package chapter06.section02.lesson6;

/**
 * @author: deng
 * @datetime: 2020/6/2 3:39 下午
 * @desc: DCL 双重检查锁机制 Double -Checking -Lock
 */
public class MyObject {
    volatile private static MyObject myObject;

    private MyObject() {
    }


    // 使用双检测机制来解决问题
    // 即保证了不需要同步代码的异步
    // 又保证了单例的效果
    public static MyObject getInstance() {
        try {
            if (myObject != null) {
            } else {
                // 模拟在创建对象之前做一些准备性的工作
                Thread.sleep(3000);
                synchronized (MyObject.class) {
                    if (myObject == null) {
                        myObject = new MyObject();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }

}

