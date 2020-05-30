package chapter03.section02.lesson1;

/**
 * @author: deng
 * @datetime: 2020/5/29 10:57 下午
 * @desc:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            int secondValue = (int) (Math.random() * 10000);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
