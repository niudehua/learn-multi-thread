package chapter02.section01.lesson10;

/**
 * @author: deng
 * @datetime: 2020/5/21 2:19 下午
 * @desc:
 */
public class ThreadB extends Thread {
    private Sub sub;

    public ThreadB(Sub sub) {
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.testMethod();
    }
}
