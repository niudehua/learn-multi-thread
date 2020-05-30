package chapter03.section01.lesson9;

/**
 * @author: deng
 * @datetime: 2020/5/27 3:44 下午
 * @desc: wait(long)方法设置等待时间 等待时间到了会自动唤醒，也可以在等待时间内调用notify()提前唤醒
 */
public class MyRunnable {
    static private Object lock = new Object();
    static private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println("wait begin time : " + System.currentTimeMillis());
                    lock.wait(5000);
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
            Thread thread1 = new Thread(runnable);
            Thread thread2 = new Thread(runnable2);
            thread1.start();
            Thread.sleep(2000);
            thread2.start();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
