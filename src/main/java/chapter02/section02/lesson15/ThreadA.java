package chapter02.section02.lesson15;

/**
 * @author: deng
 * @datetime: 2020/5/23 10:03 下午
 * @desc:
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        Service.printA();
    }
}
