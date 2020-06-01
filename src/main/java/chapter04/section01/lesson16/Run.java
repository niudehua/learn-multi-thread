package chapter04.section01.lesson16;

/**
 * @author: deng
 * @datetime: 2020/6/1 9:33 上午
 * @desc: lock.isFair():判断是不是公平锁 默认情况ReentrantLock使用的是非公平锁
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        final Service service1 = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service1.serviceMethod();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        final Service service2 = new Service(false);
        runnable = new Runnable() {
            @Override
            public void run() {
                service2.serviceMethod();
            }
        };
        thread = new Thread(runnable);
        thread.start();

    }
}