package chapter03.section02.lesson3;

/**
 * @author: deng
 * @datetime: 2020/5/29 11:12 下午
 * @desc:
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String newString = new String();
            Math.random();
        }
    }
}
