package chapter04.section01.lesson15;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: deng
 * @datetime: 2020/6/1 9:18 上午
 * @desc:
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition newCondition = lock.newCondition();

    public void waitMethod() {
        lock.lock();
        try {
            newCondition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void notityMethod() {
        lock.lock();
        try {
            System.out.println("有没有线程正在等待newCondition？"
                    + lock.hasWaiters(newCondition) + " 线程数是多少？"
                    + lock.getWaitQueueLength(newCondition));
            newCondition.signal();
        } finally {
            lock.unlock();
        }
    }
}
