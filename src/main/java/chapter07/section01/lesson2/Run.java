package chapter07.section01.lesson2;


/**
 * @author: deng
 * @datetime: 2020/6/2 10:48 下午
 * @desc: 线程执行sleep()方法后线程的状态就是TIMED_WAITING状态
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(1);
            System.out.println("main 方法中的状态：" + myThread.getState());
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
