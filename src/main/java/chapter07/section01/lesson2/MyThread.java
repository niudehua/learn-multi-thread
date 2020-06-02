package chapter07.section01.lesson2;

/**
 * @author: deng
 * @datetime: 2020/6/2 10:37 下午
 * @desc:
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("begin sleep");
            Thread.sleep(10000);
            System.out.println("begin end");
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
