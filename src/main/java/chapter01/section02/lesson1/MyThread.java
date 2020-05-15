package chapter01.section02.lesson1;

/**
 * @author: deng
 * @datetime: 2020/5/15 10:55 上午
 * @desc: 通过继承Thread类 实现自定义线程
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("通过继承Thread类 实现自定义线程");
    }
}


