package chapter03.section02.lesson4;

/**
 * @author: deng
 * @datetime: 2020/5/29 11:14 下午
 * @desc:
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("begin Timer=" + System.currentTimeMillis());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}