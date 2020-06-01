package chapter04.section01.lesson13;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: deng
 * @datetime: 2020/6/1 8:55 上午
 * @desc:
 */
public class Service {
    public ReentrantLock lock = new ReentrantLock();
    public Condition condition = lock.newCondition();

    public void waitMethod() {
        lock.lock();
        try {
            condition.await();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


    public void notifyMethod() {
        lock.lock();
        try {
            System.out.println("有" + lock.getWaitQueueLength(condition) + "个线程在等待condition");
            condition.signal();
        } finally {
            lock.unlock();
        }
    }
}
