package chapter02.section02.lesson23;

/**
 * @author: deng
 * @datetime: 2020/5/24 12:33 上午
 * @desc: 死锁问题
 */

public class SyncDeadLock {
    private static Object locka = new Object();
    private static Object lockb = new Object();

    public static void main(String[] args) {
        new SyncDeadLock().deadLock();
    }

    private void deadLock() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (locka) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " get locka ing!");
                        Thread.sleep(500);
                        System.out.println(Thread.currentThread().getName() + " after sleep 500ms!");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " need lockb!Just waiting!");
                    synchronized (lockb) {
                        System.out.println(Thread.currentThread().getName() + " get lockb ing!");
                    }
                }
            }
        }, "thread1");

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lockb) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " get lockb ing!");
                        Thread.sleep(500);
                        System.out.println(Thread.currentThread().getName() + " after sleep 500ms!");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " need locka! Just waiting!");
                    synchronized (locka) {
                        System.out.println(Thread.currentThread().getName() + " get locka ing!");
                    }
                }
            }
        }, "thread2");

        thread1.start();
        thread2.start();
    }
}

