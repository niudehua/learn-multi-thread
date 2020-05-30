package chapter03.section01.lesson16;

/**
 * @author: deng
 * @datetime: 2020/5/28 11:07 下午
 * @desc:
 */
public class ThreadPop extends Thread {
    private C c;

    public ThreadPop(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            c.popService();
        }
    }
}
