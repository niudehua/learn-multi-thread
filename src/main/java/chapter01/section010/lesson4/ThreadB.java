package chapter01.section010.lesson4;

/**
 * @author: deng
 * @datetime: 2020/5/19 4:07 下午
 * @desc:
 */
public class ThreadB extends Thread {
    private long count = 0;

    public long getCount() {
        return count;
    }

    @Override
    public void run() {
        while (true) {
            count++;
        }
    }
}
