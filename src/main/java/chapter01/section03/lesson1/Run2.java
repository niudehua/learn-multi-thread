package chapter01.section03.lesson1;

/**
 * @author: deng
 * @datetime: 2020/5/15 2:54 下午
 * @desc:
 */
public class Run2 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
//        myThread.run();
        myThread.start();
    }
}
