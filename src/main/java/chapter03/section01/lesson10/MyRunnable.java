package chapter03.section01.lesson10;


/**
 * @author: deng
 * @datetime: 2020/5/27 4:01 下午
 * @desc: 提前唤醒 wait()方法永远不会被通知
 */
public class MyRunnable {
    static private Object lock = new Object();
    static private Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println("wait begin time : " + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("wait end time : " + System.currentTimeMillis());
                }
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    };

    static private Runnable runnable2 = new Runnable() {
        @Override
        public void run() {
            synchronized (lock) {
                System.out.println("notify begin time : " + System.currentTimeMillis());
                lock.notify();
                System.out.println("notify end time : " + System.currentTimeMillis());
            }
        }
    };

    public static void main(String[] args) {
        try {
            Thread thread1 = new Thread(runnable1);
            Thread thread2 = new Thread(runnable2);
            thread2.start();
            Thread.sleep(1000);
            thread1.start();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
