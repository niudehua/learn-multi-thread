package chapter04.section01.lesson10;

/**
 * @author: deng
 * @datetime: 2020/5/31 12:27 上午
 * @desc: 非公平锁的执行基本是呈乱序状态
 */
public class RunNotFair {

    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service(false);

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