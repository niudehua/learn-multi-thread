package chapter01.section08.lesson2;

/**
 * @author: deng
 * @datetime: 2020/5/17 10:14 下午
 * @desc:
 */
public class Run {
    public static void main(String[] args) {
        try {
            final SynchronizeObject synchronizeObject = new SynchronizeObject();
            Thread thread1 = new Thread() {
                @Override
                public void run() {
                    System.out.println("thread1启动");
                    synchronizeObject.printString();
                }
            };
            thread1.setName("a");
            thread1.start();
            Thread.sleep(1000);
            Thread thread2 = new Thread() {
                @Override
                public void run() {
                    System.out.println("thread2启动");
                    synchronizeObject.printString();
                }
            };
            thread2.start();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

    }
}
