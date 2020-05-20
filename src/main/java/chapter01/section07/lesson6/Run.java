package chapter01.section07.lesson6;

/**
 * @author: deng
 * @datetime: 2020/5/15 10:12 下午
 * @desc:
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(200);
            myThread.interrupt();
            System.out.println("main end");
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
