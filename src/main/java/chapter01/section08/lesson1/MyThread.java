package chapter01.section08.lesson1;

/**
 * @author: deng
 * @datetime: 2020/5/16 11:51 上午
 * @desc:
 */
public class MyThread extends Thread {
    private long i = 0;

    @Override
    public void run() {
        while (true) {
            i++;
        }
    }

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }
}
