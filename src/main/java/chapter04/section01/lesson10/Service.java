package chapter04.section01.lesson10;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: deng
 * @datetime: 2020/5/31 12:23 上午
 * @desc: 公平锁与非公平锁
 */
public class Service {

    private ReentrantLock lock;

    public Service(boolean isFair) {
        super();
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {
        lock.lock();
        try {
            System.out.println("ThreadName=" + Thread.currentThread().getName()
                    + "获得锁定");
        } finally {
            lock.unlock();
        }
    }

}