package chapter01.section05.lesson2;

/**
 * @author: deng
 * @datetime: 2020/5/15 3:32 下午
 * @desc:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("sleep前-Thread.currentThread().getName()：" + Thread.currentThread().getName() + "\tSystem.currentTimeMillis():" + System.currentTimeMillis());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println("sleep后-Thread.currentThread().getName()：" + Thread.currentThread().getName() + "\tSystem.currentTimeMillis():" + System.currentTimeMillis());
    }
}
