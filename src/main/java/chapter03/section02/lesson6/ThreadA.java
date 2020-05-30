package chapter03.section02.lesson6;

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
        try {
            synchronized (b) {
                b.start();
                b.join(100);
                for (int i = 0; i < Short.MAX_VALUE; i++) {
                    String newString = new String();
                    Math.random();
//                    System.out.println(i);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
