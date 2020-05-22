package chapter02.section01.lesson8;

/**
 * @author: deng
 * @datetime: 2020/5/21 11:07 上午
 * @desc: 继承对象的synchronized锁可重入
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
