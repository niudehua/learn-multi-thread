package chapter02.section01.lesson7;

/**
 * @author: deng
 * @datetime: 2020/5/21 10:46 上午
 * @desc: synchronized锁重入
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
