package chapter04.section01.lesson25;

import java.util.Calendar;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: deng
 * @datetime: 2020/6/1 2:42 下午
 * @desc: awaitUntil(Date) 使当前线程等待，直到发出信号或中断它，或指定的截止日期过期
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod() {
        lock.lock();
        try {
            System.out.println("wait begin timer=" + System.currentTimeMillis());

            Calendar calendarRef = Calendar.getInstance();
            calendarRef.add(Calendar.SECOND, 10);
            condition.awaitUntil(calendarRef.getTime());
            System.out.println("wait   end timer=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void notifyMethod() {
        lock.lock();
        try {
            Calendar calendarRef = Calendar.getInstance();
            calendarRef.add(Calendar.SECOND, 10);
            System.out.println("notify begin timer=" + System.currentTimeMillis());
            condition.signalAll();
            System.out.println("notify   end timer=" + System.currentTimeMillis());
        } finally {
            lock.unlock();
        }

    }

}
