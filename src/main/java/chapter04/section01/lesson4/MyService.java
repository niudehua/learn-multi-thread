package chapter04.section01.lesson4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: deng
 * @datetime: 2020/5/30 3:59 下午
 * @desc:
 */
public class MyService {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await() {
        lock.lock();
        try {
            System.out.println("A");
            condition.await();
            System.out.println("B");
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("释放了");
        }
    }
}
