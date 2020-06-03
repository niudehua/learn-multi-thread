package chapter03.section02.lesson5;

/**
 * @author: deng
 * @datetime: 2020/5/30 12:00 上午
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
        System.out.println(Thread.currentThread().getName() + " a run");
        try {
            synchronized (b) {
                b.start();
                Thread.sleep(10000);
                for (int i = 0; i < Short.MAX_VALUE; i++) {
                    String newString = new String();
                    Math.random();
                    System.out.println(i);
                }                // Thread.sleep()不释放锁
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
