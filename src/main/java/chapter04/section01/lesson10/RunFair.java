package chapter04.section01.lesson10;

/**
 * @author: deng
 * @datetime: 2020/5/31 12:24 上午
 * @desc: 公平锁的执行顺序基本呈有序状态
 */
public class RunFair {

    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service(true);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("★线程" + Thread.currentThread().getName()
                        + "运行了");
                service.serviceMethod();
            }
        };

        Thread[] threadArray = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }

    }
}
