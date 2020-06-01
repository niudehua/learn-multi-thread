package chapter04.section01.lesson18;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: deng
 * @datetime: 2020/6/1 9:48 上午
 * @desc:
 */
public class Service {
    private ReentrantLock lock;

    public Service(boolean isFair) {
        super();
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {
        System.out.println(lock.isLocked());
        lock.lock();
        try {
            System.out.println(lock.isLocked());
        } finally {
            lock.unlock();
        }
    }
}
