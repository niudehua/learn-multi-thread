package chapter03.section02.lesson7;

/**
 * @author: deng
 * @datetime: 2020/5/30 9:45 上午
 * @desc:
 */
public class ThreadB extends Thread {
    @Override
    synchronized public void run() {
        try {
            System.out.println("begin B ThreadName="
                    + Thread.currentThread().getName() + "  "
                    + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("  end B ThreadName="
                    + Thread.currentThread().getName() + "  "
                    + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
