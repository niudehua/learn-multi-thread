package chapter04.section01.lesson15;

/**
 * @author: deng
 * @datetime: 2020/6/1 9:21 上午
 * @desc: lock.hasWaiters(Condition) :查询是否有线程正在等待与此锁有关的Condition条件
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
        service.notityMethod();
    }
}
