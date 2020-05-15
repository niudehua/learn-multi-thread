package chapter01.section02.lesson5;

/**
 * @author: deng
 * @datetime: 2020/5/15 12:38 下午
 * @desc:
 */
public class MyThread extends Thread {
    private int count = 5;

    @Override
    public void run() {
        super.run();
        count--;
        System.out.println(currentThread().getName() + "计算：" + count);

    }
}
