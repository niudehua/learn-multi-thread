package chapter01.section07.lesson1;

/**
 * @author: deng
 * @datetime: 2020/5/15 3:55 下午
 * @desc:
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(2000);
            myThread.interrupt();
        } catch (InterruptedException exception) {
            System.out.println("main catch");
            exception.printStackTrace();
        }
    }
}
