package chapter02.section03.lesson4;

/**
 * @author: deng
 * @datetime: 2020/5/24 8:50 下午
 * @desc:
 */
public class Run {
    public static void main(String[] args) {
        MyThread[] myThread = new MyThread[100];
        for (int i = 0; i < 100; i++) {
            myThread[i] = new MyThread();
        }
        for (int i = 0; i < 100; i++) {
            myThread[i].start();
        }
    }
}
