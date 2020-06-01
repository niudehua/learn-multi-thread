package chapter04.section01.lesson22;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: deng
 * @datetime: 2020/6/1 11:03 上午
 * @desc:
 */
public class MyService {
    public ReentrantLock lock = new ReentrantLock();

    public void waitMethod() {
        try {
            if (lock.tryLock(3, TimeUnit.SECONDS)) {
                System.out.println("      " + Thread.currentThread().getName()
                        + "获得锁的时间：" + System.currentTimeMillis());
                Thread.sleep(10000);
            } else {
                System.out.println("      " + Thread.currentThread().getName()
                        + "没有获得锁");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }
}
