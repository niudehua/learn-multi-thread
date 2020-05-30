package chapter03.section01.lesson4;

/**
 * @author: deng
 * @datetime: 2020/5/25 3:13 下午
 * @desc: 使用wait/notify 机制完成 lesson1 size==5的实验
 */
public class Run {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            ThreadA threadA = new ThreadA(lock);
            ThreadB threadB = new ThreadB(lock);
            threadA.start();
            Thread.sleep(5000);
            threadB.start();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
