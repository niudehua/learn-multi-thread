package chapter04.section01.lesson2;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: deng
 * @datetime: 2020/5/30 3:33 下午
 * @desc:
 */
public class MyService {
    private ReentrantLock lock = new ReentrantLock();

    public void serviceMethodA() {
        lock.lock();
        try {
            System.out.println("线程：" + Thread.currentThread().getName() + " begin serviceMethodA time：" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("线程：" + Thread.currentThread().getName() + " end serviceMethodA time: " + System.currentTimeMillis());
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void serviceMethodB() {
        lock.lock();
        try {
            System.out.println("线程：" + Thread.currentThread().getName() + " begin serviceMethodB time：" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("线程：" + Thread.currentThread().getName() + " end serviceMethodB time: " + System.currentTimeMillis());
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
