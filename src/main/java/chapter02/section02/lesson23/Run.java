package chapter02.section02.lesson23;

/**
 * @author: deng
 * @datetime: 2020/5/24 12:12 上午
 * @desc: 不同的线程等待不可能释放的锁 出现死锁
 */
public class Run {
    public static void main(String[] args) {
        try {
            DealThread dealThread = new DealThread();
            dealThread.setFlag("a");
            Thread thread1 = new Thread(dealThread);
            thread1.start();

            Thread.sleep(100);
            dealThread.setFlag("b");
            Thread thread2 = new Thread(dealThread);
            thread2.start();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
