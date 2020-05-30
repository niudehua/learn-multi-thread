package chapter03.section01.lesson4;

/**
 * @author: deng
 * @datetime: 2020/5/25 3:07 下午
 * @desc:
 */
public class ThreadA extends Thread {
    private Object lock;

    public ThreadA(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                if (MyList.size() != 5) {
                    System.out.println("wait begin : " + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("wait end : " + System.currentTimeMillis());
                }
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
