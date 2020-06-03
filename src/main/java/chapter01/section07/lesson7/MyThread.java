package chapter01.section07.lesson7;

/**
 * @author: deng
 * @datetime: 2020/5/15 11:09 下午
 * @desc:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5000; i++) {
                System.out.println("i=" + (i + 1));
            }
            System.out.println("run begin");
            Thread.sleep(2000);
            System.out.println("run end");
        } catch (InterruptedException exception) {
            System.out.println("MyThread catch  Thread.interrupted()：" + Thread.interrupted());
            exception.printStackTrace();
        }
    }
}
