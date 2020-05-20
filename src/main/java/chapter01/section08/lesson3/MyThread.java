package chapter01.section08.lesson3;

/**
 * @author: deng
 * @datetime: 2020/5/18 9:28 上午
 * @desc:
 */
public class MyThread extends Thread {
    private long i = 0;

    @Override
    public void run() {
        while (true) {
            i++;
            System.out.println(i);
        }
    }
}
