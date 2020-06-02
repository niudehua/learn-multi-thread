package chapter07.section01.lesson3;

/**
 * @author: deng
 * @datetime: 2020/6/2 11:29 下午
 * @desc:
 */
public class MyThreadB extends Thread {
    @Override
    public void run() {
        MyService.serviceMethod();
    }
}
