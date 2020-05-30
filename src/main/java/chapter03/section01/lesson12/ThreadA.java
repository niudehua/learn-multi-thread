package chapter03.section01.lesson12;

/**
 * @author: deng
 * @datetime: 2020/5/27 5:08 下午
 * @desc:
 */
public class ThreadA extends Thread {
    private Add add;

    public ThreadA(Add add) {
        this.add = add;
    }

    @Override
    public void run() {
        add.add();
    }
}
