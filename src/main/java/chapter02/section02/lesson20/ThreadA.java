package chapter02.section02.lesson20;

/**
 * @author: deng
 * @datetime: 2020/5/23 11:37 下午
 * @desc:
 */
public class ThreadA extends Thread {

    @Override
    public void run() {
        Service.print(new Object());
    }
}
