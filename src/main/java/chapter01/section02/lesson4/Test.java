package chapter01.section02.lesson4;

/**
 * @author: deng
 * @datetime: 2020/5/15 11:50 上午
 * @desc: 线程变量不共享
 */
public class Test {
    public static void main(String[] args) {
        MyThread myThreadA = new MyThread("A");
        MyThread myThreadB = new MyThread("B");
        MyThread myThreadC = new MyThread("C");
        myThreadA.start();
        myThreadB.start();
        myThreadC.start();
    }
}
