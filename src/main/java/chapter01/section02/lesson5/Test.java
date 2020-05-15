package chapter01.section02.lesson5;

/**
 * @author: deng
 * @datetime: 2020/5/15 12:40 下午
 * @desc: 线程共享变量 非线程安全问题
 */
public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread a = new Thread(myThread, "a");
        Thread b = new Thread(myThread, "b");
        Thread c = new Thread(myThread, "c");
        Thread d = new Thread(myThread, "d");
        Thread e = new Thread(myThread, "e");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
