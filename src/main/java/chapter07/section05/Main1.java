package chapter07.section05;

import java.lang.Thread.UncaughtExceptionHandler;

/**
 * @author: deng
 * @datetime: 2020/6/3 11:49 下午
 * @desc: UncaughtExceptionHandler:设置在此线程由于未捕获异常而突然终止时调用的处理程序。 线程可以通过显式设置其未捕获异常处理程序来完全控制如何响应未捕获异常。如果未设置此类处理程序，则线程的ThreadGroup对象作为其处理程序。
 */
public class Main1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("线程t1");
        t1.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("线程:" + t.getName() + " 出现了异常：");
                e.printStackTrace();
            }
        });
        t1.start();

        MyThread t2 = new MyThread();
        t2.setName("线程t2");
        t2.start();
    }
}
