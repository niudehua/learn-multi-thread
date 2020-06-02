package chapter07.section01.lesson4;

/**
 * @author: deng
 * @datetime: 2020/6/2 11:39 下午
 * @desc:
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        try {
            synchronized (Lock.lock) {
                Lock.lock.wait();
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
