package chapter01.section07.lesson10;

/**
 * @author: deng
 * @datetime: 2020/5/16 10:41 上午
 * @desc:
 */
public class MyThread extends Thread {
    private SynchronizeObject synchronizeObject;

    public MyThread(SynchronizeObject synchronizeObject) {
        this.synchronizeObject = synchronizeObject;
    }

    @Override
    public void run() {
        synchronizeObject.printString("b","bbb");
    }

}
