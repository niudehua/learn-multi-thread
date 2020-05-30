package chapter04.section01.lesson8;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: deng
 * @datetime: 2020/5/30 4:53 下午
 * @desc:
 */
public class MyService {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean hasValue = false;

    public void set() {
        lock.lock();
        try {
            while (hasValue) {
                condition.await();
            }
            System.out.println("打印：★");
            hasValue = true;
            condition.signal();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void get() {
        lock.lock();
        try {
            while (!hasValue) {
                condition.await();
            }
            System.out.println("打印：☆");
            hasValue = false;
            condition.signal();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
