package chapter01.section07.lesson4;

/**
 * @author: deng
 * @datetime: 2020/5/15 5:53 下午
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
            exception.printStackTrace();
        }

    }
}
