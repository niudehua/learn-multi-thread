package chapter01.section07.lesson5;

/**
 * @author: deng
 * @datetime: 2020/5/15 6:00 下午
 * @desc:
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(30);
            myThread.interrupt();
            System.out.println("end");
        } catch (InterruptedException exception) {
            System.out.println("main catch");
            exception.printStackTrace();
        }

    }
}
