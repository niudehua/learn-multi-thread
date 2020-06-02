package chapter06.section02.lesson5;

/**
 * @author: deng
 * @datetime: 2020/6/2 3:27 下午
 * @desc: 只对实例化对象的关键代码 做了同步，从语句的结构上来讲，效率确实提高了，但是对于多线程场景还是无法解决得到同一实例对象的结果。
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
