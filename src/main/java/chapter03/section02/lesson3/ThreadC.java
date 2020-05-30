package chapter03.section02.lesson3;

/**
 * @author: deng
 * @datetime: 2020/5/29 11:14 下午
 * @desc:
 */
public class ThreadC extends Thread {

    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        super();
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.interrupt();
    }

}