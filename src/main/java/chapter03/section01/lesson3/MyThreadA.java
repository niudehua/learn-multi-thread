package chapter03.section01.lesson3;

/**
 * @author: deng
 * @datetime: 2020/5/25 2:51 下午
 * @desc:
 */
public class MyThreadA extends Thread {
    private Object lock;

    public MyThreadA(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                System.out.println("开始wait  time = " + System.currentTimeMillis());
                lock.wait();
                System.out.println("结束wait  time = " + System.currentTimeMillis());
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
