package chapter01.section07.lesson6;

/**
 * @author: deng
 * @datetime: 2020/5/15 10:10 下午
 * @desc: sleep 停止
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5000; i++) {
                System.out.println("i=" + (i + 1));
            }
            System.out.println("run begin");
            Thread.sleep(300);
            System.out.println("run end");
        } catch (InterruptedException exception) {
            System.out.println("在沉睡中停止，进入catch Thread.interrupted()：" + Thread.interrupted());
            exception.printStackTrace();
        }
    }
}
