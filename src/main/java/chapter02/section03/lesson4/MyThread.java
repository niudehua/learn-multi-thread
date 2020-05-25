package chapter02.section03.lesson4;

/**
 * @author: deng
 * @datetime: 2020/5/24 8:48 下午
 * @desc:
 */
public class MyThread extends Thread {
    volatile public static int count;

    private static void addCount() {
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("count = " + count);
    }

    @Override
    public void run() {
        addCount();
    }
}
