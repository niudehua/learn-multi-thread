package chapter04.section01.lesson24;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: deng
 * @datetime: 2020/6/1 11:27 上午
 * @desc:
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void testMethod() {
        lock.lock();
        try {
            System.out.println("wait begin");
            condition.awaitUninterruptibly();
            System.out.println("wait   end");
        } finally {
            lock.unlock();
        }

    }
}
