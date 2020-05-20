package chapter01.section010.lesson1;

/**
 * @author: deng
 * @datetime: 2020/5/18 3:58 下午
 * @desc:
 */
public class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("MyThread1 初始优先级："+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(7);
        System.out.println("MyThread1 设置后的优先级："+Thread.currentThread().getPriority());
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
    }
}
