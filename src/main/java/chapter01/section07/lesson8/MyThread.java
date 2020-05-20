package chapter01.section07.lesson8;

/**
 * @author: deng
 * @datetime: 2020/5/15 11:09 下午
 * @desc:
 */
public class MyThread extends Thread {
    private int i = 0;

    @Override
    public void run() {
        try {
            while (true) {
                i++;
                System.out.println("i=" + (i + 1));
                Thread.sleep(1000);
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
