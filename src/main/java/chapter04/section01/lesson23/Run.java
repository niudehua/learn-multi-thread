package chapter04.section01.lesson23;

/**
 * @author: deng
 * @datetime: 2020/6/1 11:28 上午
 * @desc:
 */
public class Run {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            MyThread myThread = new MyThread(service);
            myThread.start();
            Thread.sleep(3000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
