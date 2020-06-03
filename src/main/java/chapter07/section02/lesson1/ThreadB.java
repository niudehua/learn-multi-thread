package chapter07.section02.lesson1;

/**
 * @author: deng
 * @datetime: 2020/6/3 9:13 上午
 * @desc:
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("ThreadName=" + Thread.currentThread().getName());
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
