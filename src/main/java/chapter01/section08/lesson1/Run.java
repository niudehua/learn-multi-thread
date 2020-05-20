package chapter01.section08.lesson1;

/**
 * @author: deng
 * @datetime: 2020/5/16 11:54 上午
 * @desc: suspend()方法：暂停线程   resume()方法：恢复线程
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(5000);
            myThread.suspend();
            System.out.println("暂停时A：" + System.currentTimeMillis() + "\ti=" + myThread.getI());
            Thread.sleep(1000);
            System.out.println("暂停时A睡眠：" + System.currentTimeMillis() + "\ti=" + myThread.getI());
            myThread.resume();
            System.out.println("恢复时B：" + System.currentTimeMillis() + "\ti=" + myThread.getI());
            Thread.sleep(5000);
            System.out.println("恢复时B睡眠：" + System.currentTimeMillis() + "\ti=" + myThread.getI());
            myThread.suspend();
            System.out.println("暂停时C：" + System.currentTimeMillis() + "\ti=" + myThread.getI());
            Thread.sleep(5000);
            System.out.println("暂停时C睡眠：" + System.currentTimeMillis() + "\ti=" + myThread.getI());

        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
