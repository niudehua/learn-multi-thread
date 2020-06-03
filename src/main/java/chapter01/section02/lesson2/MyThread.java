package chapter01.section02.lesson2;

/**
 * @author: deng
 * @datetime: 2020/5/15 11:08 上午
 * @desc: 线程随机性
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run=" + Thread.currentThread().getName());
            }

        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
