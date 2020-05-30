package chapter04.section01.lesson5;

/**
 * @author: deng
 * @datetime: 2020/5/30 4:09 下午
 * @desc: 正确使用Condition 实现等待/通知
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyService myService = new MyService();
            Thread await = new Thread(new Runnable() {
                @Override
                public void run() {
                    myService.await();
                }
            });

            await.start();
            Thread.sleep(1000);
            myService.signal();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
