package chapter03.section01.lesson3;

/**
 * @author: deng
 * @datetime: 2020/5/25 2:51 下午
 * @desc:
 */
public class MyThreadB extends Thread {
    private Object lock;

    public MyThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("开始notify  time = " + System.currentTimeMillis());
            lock.notify();
            System.out.println("结束notify  time = " + System.currentTimeMillis());
        }

    }
}
