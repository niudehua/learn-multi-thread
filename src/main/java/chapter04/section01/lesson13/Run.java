package chapter04.section01.lesson13;

/**
 * @author: deng
 * @datetime: 2020/6/1 8:57 上午
 * @desc: getWaitQueueLength(condition) 返回等待与此锁相关的给定条件condition的线程估计数
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };

        Thread[] threadArray = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
        Thread.sleep(2000);
        service.notifyMethod();
    }
}
