package chapter04.section01.lesson23;

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
            condition.await();
            System.out.println("wait   end");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("catch");
        } finally {
            lock.unlock();
        }

    }
}
