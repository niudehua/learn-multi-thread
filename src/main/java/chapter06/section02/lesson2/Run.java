package chapter06.section02.lesson2;

/**
 * @author: deng
 * @datetime: 2020/6/2 3:27 下午
 * @desc: 3个线程打印了3中hashcode。说明创建了3个对象，并不是单例的，这是错误的"单例模式"
 */
public class Run {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.start();
        t2.start();
        t3.start();
    }
}
