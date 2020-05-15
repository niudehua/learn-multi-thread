package chapter01.section07.lesson2;

/**
 * @author: deng
 * @datetime: 2020/5/15 4:06 下午
 * @desc: interrupted() 测试的是当前线程 当前线程为main线程
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(1000);
            myThread.interrupt();
//            Thread.currentThread().interrupt();
            System.out.println("是否中断1?：" + Thread.interrupted());
            System.out.println("是否中断2?：" + Thread.interrupted());
        } catch (InterruptedException exception) {
            System.out.println("main catch");
            exception.printStackTrace();
        }
        System.out.println("end");
    }
}
