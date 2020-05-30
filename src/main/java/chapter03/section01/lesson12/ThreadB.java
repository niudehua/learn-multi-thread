package chapter03.section01.lesson12;

/**
 * @author: deng
 * @datetime: 2020/5/27 5:08 下午
 * @desc:
 */
public class ThreadB extends Thread {
    private Subtract subtract;

    public ThreadB(Subtract subtract) {
        this.subtract = subtract;
    }

    @Override
    public void run() {
        subtract.subtract();
    }
}
