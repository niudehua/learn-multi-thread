package chapter03.section02.lesson7;

/**
 * @author: deng
 * @datetime: 2020/5/30 9:44 上午
 * @desc:
 */
public class ThreadA extends Thread {
    private ThreadB b;

    public ThreadA(ThreadB b) {
        super();
        this.b = b;
    }

    @Override
    public void run() {
        try {
            synchronized (b) {
                System.out.println("begin A ThreadName="
                        + Thread.currentThread().getName() + "  "
                        + System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("  end A ThreadName="
                        + Thread.currentThread().getName() + "  "
                        + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}