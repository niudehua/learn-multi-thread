package chapter07.section01.lesson1;

/**
 * @author: deng
 * @datetime: 2020/6/2 10:37 下午
 * @desc:
 */
public class MyThread extends Thread {
    public MyThread() {
        System.out.println("构造方法中的状态：" + Thread.currentThread().getState());
    }

    @Override
    public void run() {
        System.out.println("run 方法中的状态" + Thread.currentThread().getState());
    }
}
