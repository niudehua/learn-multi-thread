package chapter04.section01.lesson12;

/**
 * @author: deng
 * @datetime: 2020/5/31 11:48 下午
 * @desc: getQueueLength()方法：返回正等待获取此锁的线程估计数
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.serviceMethod();
            }
        };

        Thread[] threads = new Thread[1000];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(runnable);
            threads[i].setName(String.valueOf((i + 1)));
            threads[i].start();
        }
        Thread.sleep(1000);
        System.out.println("有线程数：" + service.lock.getQueueLength() + "在等待释放锁");
    }
}
