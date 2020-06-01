package chapter04.section01.lesson17;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: deng
 * @datetime: 2020/6/1 9:35 上午
 * @desc:
 */
public class Service {
    private ReentrantLock lock;

    public Service(boolean isFair) {
        super();
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {
        System.out.println(lock.isHeldByCurrentThread());
        lock.lock();
        try {
            System.out.println(lock.isHeldByCurrentThread());
        } finally {
            lock.unlock();
        }
    }
}

