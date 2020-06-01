package chapter04.section01.lesson14;

/**
 * @author: deng
 * @datetime: 2020/6/1 9:14 上午
 * @desc: hasQueuedThread(Thread)查询指定的线程是否在等待此锁，hasQueuedThreads()查询是否有线程在等待此锁
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

        Thread threadA = new Thread(runnable);
        threadA.start();

        Thread.sleep(500);

        Thread threadB = new Thread(runnable);
        threadB.start();

        Thread.sleep(500);
        System.out.println(service.lock.hasQueuedThread(threadA));
        System.out.println(service.lock.hasQueuedThread(threadB));
        System.out.println(service.lock.hasQueuedThreads());
    }
}
