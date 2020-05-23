package chapter02.section02.lesson13;

/**
 * @author: deng
 * @datetime: 2020/5/23 9:04 下午
 * @desc:
 */
public class MyObject {
    synchronized public void speedPrintString() {
        System.out.println("speedPrintString() getLock:" + Thread.currentThread().getName() + "\ttime:" + System.currentTimeMillis());
        System.out.println("-----");
        System.out.println("speedPrintString() releaseLock:" + Thread.currentThread().getName() + "\ttime:" + System.currentTimeMillis());
    }
}
