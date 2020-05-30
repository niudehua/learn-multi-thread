package chapter03.section01.lesson3;

/**
 * @author: deng
 * @datetime: 2020/5/25 2:57 下午
 * @desc: wait/notify 机制的实现
 */
public class Run {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            MyThreadA myThreadA = new MyThreadA(lock);
            MyThreadB myThreadB = new MyThreadB(lock);
            myThreadA.start();
            Thread.sleep(3000);
            myThreadB.start();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
