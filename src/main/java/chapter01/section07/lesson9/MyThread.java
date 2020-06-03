package chapter01.section07.lesson9;

/**
 * @author: deng
 * @datetime: 2020/5/16 10:41 上午
 * @desc:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("stop 前");
            this.stop();
            System.out.println("stop 后");
        } catch (ThreadDeath e) {
            e.printStackTrace();
        }
    }
}
