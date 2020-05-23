package chapter02.section02.lesson27;

import chapter02.section02.lesson27.OutClass.Inner1;
import chapter02.section02.lesson27.OutClass.Inner2;

/**
 * @author: deng
 * @datetime: 2020/5/24 1:38 上午
 * @desc: 同步代码块synchronized(class2)对class2上锁后，其它线程只能以同步方法调用class2中的同步方法
 */
public class Run {
    public static void main(String[] args) {
        final Inner1 inner1 = new Inner1();
        final Inner2 inner2 = new Inner2();
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                inner1.method1(inner2);
            }
        },"a");
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                inner1.method2();
            }
        }, "b");
        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {
                inner2.method();
            }
        }, "c");

        threadA.start();
        threadB.start();
        threadC.start();

    }

}
