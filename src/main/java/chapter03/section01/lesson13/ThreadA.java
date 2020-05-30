package chapter03.section01.lesson13;

/**
 * @author: deng
 * @datetime: 2020/5/27 5:34 下午
 * @desc:
 */
public class ThreadA extends Thread {
    private P p;

    public ThreadA(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.setValue();
        }
    }
}
