package chapter01.section07.lesson10;

/**
 * @author: deng
 * @datetime: 2020/5/16 10:41 上午
 * @desc: 通过stop方法 释放锁（synchronize） 会导致数据不一致
 */
public class Run {
    public static void main(String[] args) {
        try {
            SynchronizeObject synchronizeObject = new SynchronizeObject();
            MyThread myThread = new MyThread(synchronizeObject);
            myThread.start();
            Thread.sleep(5000);
            myThread.stop();
            System.out.println("synchronizeObject.getUsername()" + synchronizeObject.getUsername());
            System.out.println("synchronizeObject.getPassword()" + synchronizeObject.getPassword());
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

    }
}

