package chapter01.section08.lesson4;

/**
 * @author: deng
 * @datetime: 2020/5/18 9:39 上午
 * @desc: 线程暂停时 print()方法中的同步锁未释放
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final MyObject myObject = new MyObject();
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                myObject.setValue("aa", "aaaa");
            }
        };
        thread1.setName("aa");
        thread1.start();
        Thread.sleep(1000);
        thread1.suspend();
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                myObject.printString();
            }
        };
        thread2.start();
    }

}
