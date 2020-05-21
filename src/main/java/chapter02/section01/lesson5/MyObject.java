package chapter02.section01.lesson5;

/**
 * @author: deng
 * @datetime: 2020/5/21 9:07 上午
 * @desc:
 */
public class MyObject {
    synchronized public void methodA() {
        try {
            System.out.println("methodA() begin - threadName:" + Thread.currentThread().getName());
            System.out.println("methodA() begin - beginTime:" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("methodA() end" + Thread.currentThread().getName());
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

    }

    synchronized public void methodB() {
        try {
            System.out.println("methodB() begin - threadName:" + Thread.currentThread().getName());
            System.out.println("methodB() begin - beginTime:" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("methodB() end" + Thread.currentThread().getName());
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

    }
}
