package chapter04.section01.lesson12;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: deng
 * @datetime: 2020/5/31 11:45 下午
 * @desc:
 */
public class Service {
    public ReentrantLock lock = new ReentrantLock();

    public void serviceMethod() {
        lock.lock();
        try {
            System.out.println("线程" + Thread.currentThread().getName() + "进入");
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
