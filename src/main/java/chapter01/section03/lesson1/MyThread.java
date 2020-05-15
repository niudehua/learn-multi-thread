package chapter01.section03.lesson1;

/**
 * @author: deng
 * @datetime: 2020/5/15 2:52 下午
 * @desc:
 */
public class MyThread extends Thread {
    public MyThread() {
        System.out.println("打印构造方法：" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("打印run方法" + Thread.currentThread().getName());
    }
}
