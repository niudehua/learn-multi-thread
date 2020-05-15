package chapter01.section07.lesson1;

/**
 * @author: deng
 * @datetime: 2020/5/15 3:53 下午
 * @desc:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            System.out.println("i=" + (i + 1));
        }
    }
}
