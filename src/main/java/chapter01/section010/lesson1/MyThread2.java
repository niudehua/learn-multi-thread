package chapter01.section010.lesson1;

/**
 * @author: deng
 * @datetime: 2020/5/18 3:59 下午
 * @desc:
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread2 初始优先级：" + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(8);
        System.out.println("MyThread2 设置后的优先级：" + Thread.currentThread().getPriority());

    }
}
