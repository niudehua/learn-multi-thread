package chapter04.section01.lesson7;

/**
 * @author: deng
 * @datetime: 2020/5/30 4:47 下午
 * @desc: 使用多个Condition实现通知部分线程
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyService myService = new MyService();
            Thread awaitA = new Thread(new Runnable() {
                @Override
                public void run() {
                    myService.awaitA();
                }
            });

            Thread awaitB = new Thread(new Runnable() {
                @Override
                public void run() {
                    myService.awaitB();
                }
            });

            awaitA.start();
            awaitB.start();
            Thread.sleep(2000);
            myService.signalAllA();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
