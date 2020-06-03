package chapter01.section11;


/**
 * @author: deng
 * @datetime: 2020/5/19 4:49 下午
 * @desc:
 */
public class MyThread extends Thread {
    private int i = 0;

    @Override
    public void run() {
        try {
            while (true) {
                i++;
                System.out.println("i=" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
