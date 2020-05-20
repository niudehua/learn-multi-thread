package chapter01.section09;

/**
 * @author: deng
 * @datetime: 2020/5/18 2:19 下午
 * @desc:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        long begin = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 5000000; i++) {
            Thread.yield();
            count = count + (i + 1);
        }
        long end = System.currentTimeMillis();

        System.out.println("消耗" + (end - begin) + "毫秒");
    }
}
