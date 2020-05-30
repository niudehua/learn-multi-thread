package chapter04.section01.lesson1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: deng
 * @datetime: 2020/5/30 3:19 下午
 * @desc:
 */
public class MyService {
    private final Lock lock = new ReentrantLock();

    public void testMethod() {
        lock.lock();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("ThreadName=" + Thread.currentThread().getName()
                        + (" " + (i + 1)));
            }
            System.out.println("________________");
        } finally {
            lock.unlock();
        }
    }

}