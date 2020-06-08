package chapter01.section02.lesson3;

/**
 * @author: deng
 * @datetime: 2020/5/15 11:24 上午
 * @desc: 通过实现Runnable接口创建线程
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("通过实现Runnable接口创建线程");
    }
}
