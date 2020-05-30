package chapter03.section03.lesson5;

/**
 * @author: deng
 * @datetime: 2020/5/30 2:26 下午
 * @desc:
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
                System.out.println("在线程A中取值 ： " + Tools.threadLocalExt.get());
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
