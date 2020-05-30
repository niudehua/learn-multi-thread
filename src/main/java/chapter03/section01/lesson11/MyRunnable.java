package chapter03.section01.lesson11;


/**
 * @author: deng
 * @datetime: 2020/5/27 4:01 下午
 * @desc: 设置标签 如果被通知了，wait方法就没必要执行了
 */
public class MyRunnable {
    private Object lock = new Object();
    private boolean isFirstRunNotify = false;
    private Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    while (!isFirstRunNotify) {
                        System.out.println("wait begin time : " + System.currentTimeMillis());
                        lock.wait();
                        System.out.println("wait end time : " + System.currentTimeMillis());
                    }
                }
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    };

    private Runnable runnable2 = new Runnable() {
        @Override
        public void run() {
            synchronized (lock) {
                System.out.println("notify begin time : " + System.currentTimeMillis());
                lock.notify();
                System.out.println("notify end time : " + System.currentTimeMillis());
                isFirstRunNotify = true;
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable.runnable1);
        Thread thread2 = new Thread(myRunnable.runnable2);
        thread2.start();
        Thread.sleep(1000);
        thread1.start();
    }
}
