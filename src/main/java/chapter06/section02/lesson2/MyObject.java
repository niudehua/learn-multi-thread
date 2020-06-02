package chapter06.section02.lesson2;

/**
 * @author: deng
 * @datetime: 2020/6/2 3:39 下午
 * @desc: 延时加载/"懒汉模式"的缺点
 */
public class MyObject {
    private static MyObject myObject;

    private MyObject() {
    }

    public static MyObject getInstance() {
        try {
            if (myObject == null) {
                // 模拟在创建对象前做一些准备性工作
                Thread.sleep(1000);
                return new MyObject();
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

        return myObject;
    }
}

