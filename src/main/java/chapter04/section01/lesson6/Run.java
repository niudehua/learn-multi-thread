package chapter04.section01.lesson6;

/**
 * @author: deng
 * @datetime: 2020/5/30 4:21 下午
 * @desc: Condition 等待与唤醒
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                myService.awaitA();
            }
        });

        try {
            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    myService.awaitB();
                }
            });
            thread1.setName("awaitA");
            thread2.setName("awaitB");
            thread1.start();
            thread2.start();
            Thread.sleep(1000);
            myService.signalAll();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
