package chapter03.section02.lesson3;

/**
 * @author: deng
 * @datetime: 2020/5/29 11:14 下午
 * @desc:
 */
public class ThreadB extends Thread {

    @Override
    public void run() {
        try {
            ThreadA a = new ThreadA();
            a.setName("aThread");
            a.start();
            a.join();

            System.out.println("线程B在run end处打印了");
        } catch (InterruptedException e) {
            System.out.println("线程B在catch处打印了");
            e.printStackTrace();
        }
    }

}