package chapter04.section01.lesson16;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: deng
 * @datetime: 2020/6/1 9:32 上午
 * @desc:
 */
public class Service {

    private final ReentrantLock lock;

    public Service(boolean isFair) {
        super();
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {
        try {
            lock.lock();
            System.out.println("公平锁情况：" + lock.isFair());
        } finally {
            lock.unlock();
        }
    }

}