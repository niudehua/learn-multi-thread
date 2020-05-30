package chapter03.section01.lesson7;

/**
 * @author: deng
 * @datetime: 2020/5/25 4:20 下午
 * @desc: 终结：
 * 1、执行完同步代码块就会释放锁
 * 2、执行同步代码块时如果出现异常会释放锁
 * 3、执行了锁所属对象的wait()方法，这个线程会释放对象锁，而此线程对象会进入线程池中，等待唤醒。
 */
public class Run {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            ThreadA threadA = new ThreadA(lock);
            threadA.start();
            Thread.sleep(1000);
            threadA.interrupt();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
