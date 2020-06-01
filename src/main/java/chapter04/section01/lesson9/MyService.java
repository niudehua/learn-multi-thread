package chapter04.section01.lesson9;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: deng
 * @datetime: 2020/5/30 10:31 下午
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
                System.out.println(Thread.currentThread().getName() + "有可能★★连续");
                condition.await();
            }
            System.out.println(Thread.currentThread().getName() + "打印★");
            condition.signalAll();
//            condition.signal();
            hasValue = true;
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
                System.out.println(Thread.currentThread().getName() + "有可能☆☆连续");
                condition.await();
            }
            System.out.println(Thread.currentThread().getName() + "打印☆");
            condition.signalAll();
//            condition.signal();
            hasValue = false;
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
