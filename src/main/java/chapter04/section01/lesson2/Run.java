package chapter04.section01.lesson2;

/**
 * @author: deng
 * @datetime: 2020/5/30 3:37 下午
 * @desc: ReentrantLock 使用可重入锁实现同步
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                myService.serviceMethodA();
            }
        });
        thread1.setName("A1");
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                myService.serviceMethodA();
            }
        });
        thread2.setName("A2");
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                myService.serviceMethodB();
            }
        });
        thread3.setName("B1");
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                myService.serviceMethodB();
            }
        });
        thread4.setName("B2");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
