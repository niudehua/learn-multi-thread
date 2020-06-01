package chapter04.section01.lesson11;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: deng
 * @datetime: 2020/5/31 11:36 下午
 * @desc:
 */
public class Service {

    private ReentrantLock lock = new ReentrantLock();

    public void serviceMethod1() {
        lock.lock();
        try {
            System.out.println("serviceMethod1 getHoldCount="
                    + lock.getHoldCount());
            serviceMethod2();
        } finally {
            lock.unlock();
        }
    }

    public void serviceMethod2() {
        lock.lock();
        try {
            System.out.println("serviceMethod2 getHoldCount="
                    + lock.getHoldCount());
        } finally {
            lock.unlock();
        }
    }

}