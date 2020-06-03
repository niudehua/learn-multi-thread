package chapter07.section03;

/**
 * @author: deng
 * @datetime: 2020/6/3 4:30 下午
 * @desc:
 */
public class Run {
    public static void main(String[] args) {

        Object lock = new Object();

        MyThread a = new MyThread(lock, "A", 1);
        MyThread b = new MyThread(lock, "B", 2);
        MyThread c = new MyThread(lock, "C", 0);

        a.start();
        b.start();
        c.start();

    }
}
