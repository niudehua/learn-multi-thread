package chapter01.section07.lesson11;

/**
 * @author: deng
 * @datetime: 2020/5/16 11:41 上午
 * @desc:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        while (true) {
            if (this.isInterrupted()) {
                System.out.println("停止了！！");
                return;
            }
            System.out.println("System.currentTimeMillis()" + System.currentTimeMillis());
        }
    }
}
