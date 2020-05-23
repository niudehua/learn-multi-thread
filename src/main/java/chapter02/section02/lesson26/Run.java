package chapter02.section02.lesson26;

import chapter02.section02.lesson26.OutClass.Inner;

/**
 * @author: deng
 * @datetime: 2020/5/24 1:22 上午
 * @desc: 在内置类中有两个同步方法，使用不同的锁，打印结果为异步
 */
public class Run {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Inner inner = new Inner();
                inner.methodA();
            }
        }, "a");
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                OutClass outClass = new OutClass();
                outClass.methodB();
            }
        }, "b");
        thread1.start();
        thread2.start();
    }
}
