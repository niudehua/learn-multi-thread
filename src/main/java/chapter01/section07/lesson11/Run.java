package chapter01.section07.lesson11;

/**
 * @author: deng
 * @datetime: 2020/5/16 11:42 上午
 * @desc: 将interrupt 与return 结合使用让线程停止
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(10);
            myThread.interrupt();
            System.out.println("main end");
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
