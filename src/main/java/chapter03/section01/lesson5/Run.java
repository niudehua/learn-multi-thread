package chapter03.section01.lesson5;

/**
 * @author: deng
 * @datetime: 2020/5/25 3:26 下午
 * @desc:
 */
public class Run {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA threadA = new ThreadA(lock);
        ThreadB threadB = new ThreadB(lock);
        threadA.setName("a");
        threadB.setName("b");
        threadA.start();
        threadB.start();
    }
}
