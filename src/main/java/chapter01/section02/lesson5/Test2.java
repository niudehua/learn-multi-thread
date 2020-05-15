package chapter01.section02.lesson5;

/**
 * @author: deng
 * @datetime: 2020/5/15 12:40 下午
 * @desc: 线程共享变量 非线程安全问题
 */
public class Test2 {
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        Thread a = new Thread(myThread2, "a");
        Thread b = new Thread(myThread2, "b");
        Thread c = new Thread(myThread2, "c");
        Thread d = new Thread(myThread2, "d");
        Thread e = new Thread(myThread2, "e");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();


    }
}
