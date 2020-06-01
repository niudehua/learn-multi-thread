package chapter04.section01.lesson8;

/**
 * @author: deng
 * @datetime: 2020/5/30 4:57 下午
 * @desc: 实现生产者/消费者模式 ： 一对一交叉打印
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < Short.MAX_VALUE; i++) {
                    myService.set();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < Short.MAX_VALUE; i++) {
                    myService.get();
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
