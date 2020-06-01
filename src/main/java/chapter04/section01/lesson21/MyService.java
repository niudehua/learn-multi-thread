package chapter04.section01.lesson21;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: deng
 * @datetime: 2020/6/1 10:54 上午
 * @desc:
 */
public class MyService {

    public ReentrantLock lock = new ReentrantLock();

    public void waitMethod() {
        if (lock.tryLock()) {
            System.out.println(Thread.currentThread().getName() + "获得锁");
        } else {
            System.out.println(Thread.currentThread().getName() + "没有获得锁");
        }
    }
}
