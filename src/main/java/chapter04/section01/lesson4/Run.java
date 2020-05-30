package chapter04.section01.lesson4;

/**
 * @author: deng
 * @datetime: 2020/5/30 4:02 下午
 * @desc:
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                myService.await();
            }
        });
        thread.start();
    }
}
