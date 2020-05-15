package chapter01.section04.lesson1;

/**
 * @author: deng
 * @datetime: 2020/5/15 3:10 下午
 * @desc:
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        System.out.println("调用start方法前：" + myThread.isAlive());
        myThread.start();
//        Thread.sleep(1000);
        System.out.println("调用start方法后：" + myThread.isAlive());
    }
}
