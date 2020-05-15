package chapter01.section07.lesson2;

/**
 * @author: deng
 * @datetime: 2020/5/15 5:09 下午
 * @desc: isInterrupted() 测试线程对象是否中断。并不会清除状态
 */
public class Run3 {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(10);
            myThread.interrupt();
            System.out.println("是否中断1？：" + myThread.isInterrupted());
            System.out.println("是否中断2？：" + myThread.isInterrupted());
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
