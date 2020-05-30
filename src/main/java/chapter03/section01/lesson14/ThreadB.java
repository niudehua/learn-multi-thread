package chapter03.section01.lesson14;

/**
 * @author: deng
 * @datetime: 2020/5/27 5:34 下午
 * @desc:
 */
public class ThreadB extends Thread {
    private C c;

    public ThreadB(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            c.getValue();
        }
    }
}
