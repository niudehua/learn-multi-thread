package chapter02.section01.lesson10;

/**
 * @author: deng
 * @datetime: 2020/5/21 2:19 下午
 * @desc:
 */
public class ThreadA extends Thread {
    private Sub sub;

    public ThreadA(Sub sub) {
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.testMethod();
    }
}
