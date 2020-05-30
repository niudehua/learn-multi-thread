package chapter04.section01.lesson7;

import java.time.Instant;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: deng
 * @datetime: 2020/5/30 4:27 下午
 * @desc:
 */
public class MyService {
    private ReentrantLock lock = new ReentrantLock();
    private Condition conditionA = lock.newCondition();
    private Condition conditionB = lock.newCondition();

    public void awaitA() {
        lock.lock();
        try {
            System.out.println("begin awaitA time" + Instant.now().toEpochMilli());
            conditionA.await();
            System.out.println("end awaitA time" + Instant.now().toEpochMilli());
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void awaitB() {
        lock.lock();
        try {
            System.out.println("begin awaitB time" + Instant.now().toEpochMilli());
            conditionB.await();
            System.out.println("end awaitB time" + Instant.now().toEpochMilli());
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalAllA() {
        lock.lock();
        try {
            System.out.println("begin signalAllA time" + Instant.now().toEpochMilli());
            conditionA.signalAll();
            System.out.println("end signalAllA time" + Instant.now().toEpochMilli());
        } finally {
            lock.unlock();
        }
    }

    public void signalAllB() {
        lock.lock();
        try {
            System.out.println("begin signalAllB time" + Instant.now().toEpochMilli());
            conditionB.signalAll();
            System.out.println("end signalAllB time" + Instant.now().toEpochMilli());
        } finally {
            lock.unlock();
        }
    }
}
