package chapter01.section07.lesson7;

/**
 * @author: deng
 * @datetime: 2020/5/15 11:11 下午
 * @desc:
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.interrupt();
        System.out.println("main end");
    }
}
