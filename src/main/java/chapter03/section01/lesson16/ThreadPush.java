package chapter03.section01.lesson16;

/**
 * @author: deng
 * @datetime: 2020/5/28 11:07 下午
 * @desc:
 */
public class ThreadPush extends Thread {
    private P p;

    public ThreadPush(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.pushService();
        }
    }
}
