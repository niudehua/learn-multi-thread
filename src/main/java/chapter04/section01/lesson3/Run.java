package chapter04.section01.lesson3;

/**
 * @author: deng
 * @datetime: 2020/5/30 3:54 下午
 * @desc: 使用Condition实现 等待/通知 ：错误‍用法
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
