package chapter01.section07.lesson8;

/**
 * @author: deng
 * @datetime: 2020/5/15 11:11 下午
 * @desc: stop()方法暴力停止线程
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(10000);
            myThread.stop();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
