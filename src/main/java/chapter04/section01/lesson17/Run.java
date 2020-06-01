package chapter04.section01.lesson17;

/**
 * @author: deng
 * @datetime: 2020/6/1 9:36 上午
 * @desc: isHeldByCurrentThread()判断当前线程是否持有此锁
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
    }
}
