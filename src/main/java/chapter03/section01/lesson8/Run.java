package chapter03.section01.lesson8;

/**
 * @author: deng
 * @datetime: 2020/5/25 4:48 下午
 * @desc: notifyAll 唤醒所有wait线程
 */
public class Run {
    public static void main(String[] args) {
        final Object lock = new Object();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Service service = new Service();
                service.testMethod(lock);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Service service = new Service();
                service.testMethod(lock);
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Service service = new Service();
                service.testMethod(lock);
            }
        });
        Thread notifyThread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {

//                    lock.notify();
//                    lock.notify();
                    lock.notify();
                    // 唤醒所有等待线程
//                    lock.notifyAll();
                }
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        notifyThread.start();
    }
}
