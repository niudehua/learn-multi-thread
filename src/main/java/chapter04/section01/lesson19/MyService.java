package chapter04.section01.lesson19;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: deng
 * @datetime: 2020/6/1 10:10 上午
 * @desc:
 */
public class MyService {
    public ReentrantLock lock = new ReentrantLock();

    public void waitMethod() {
        assert !lock.isHeldByCurrentThread();
        lock.lock();
        try {
            System.out.println("lock begin " + Thread.currentThread().getName());
            for (int i = 0; i < Integer.MAX_VALUE / 10; i++) {
                String newString = new String();
                Math.random();
            }
            System.out.println("lock   end " + Thread.currentThread().getName());
        } finally {
            lock.unlock();
        }
    }
}
