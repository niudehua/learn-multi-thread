package chapter04.section01.lesson5;

import java.time.Instant;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: deng
 * @datetime: 2020/5/30 4:06 下午
 * @desc:
 */
public class MyService {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await() {
        lock.lock();
        try {
            System.out.println("await time : " + Instant.now().toEpochMilli());
            condition.await();
            condition.signal();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signal() {
        lock.lock();
        try {
            System.out.println("signal time : " + Instant.now().toEpochMilli());
            condition.signal();
        } finally {
            lock.unlock();
        }
    }

}
