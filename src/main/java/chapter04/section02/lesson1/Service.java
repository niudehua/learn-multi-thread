package chapter04.section02.lesson1;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author: deng
 * @datetime: 2020/6/1 3:51 下午
 * @desc:
 */
public class Service {
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read() {
        try {
            try {
                lock.readLock().lock();
                System.out.println("获得读锁" + Thread.currentThread().getName()
                        + " " + System.currentTimeMillis());
                Thread.sleep(10000);
            } finally {
                lock.readLock().unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
