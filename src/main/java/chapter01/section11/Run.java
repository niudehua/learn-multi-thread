package chapter01.section11;

/**
 * @author: deng
 * @datetime: 2020/5/19 4:51 下午
 * @desc:
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.setDaemon(true);
            myThread.start();
            Thread.sleep(5000);
            System.out.println("main线程结束了，守护线程也结束");
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
