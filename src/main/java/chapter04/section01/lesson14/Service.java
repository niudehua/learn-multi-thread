package chapter04.section01.lesson14;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: deng
 * @datetime: 2020/6/1 9:11 上午
 * @desc:
 */
public class Service {

    public ReentrantLock lock = new ReentrantLock();
    public Condition newCondition = lock.newCondition();

    public void waitMethod() {
        lock.lock();
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
