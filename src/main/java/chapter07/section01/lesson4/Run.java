package chapter07.section01.lesson4;

/**
 * @author: deng
 * @datetime: 2020/6/2 11:40 下午
 * @desc: 执行wait方法后线程的状态就是WAITING
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(1);
            System.out.println("main 方法中 myThread的状态" + myThread.getState());
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

    }
}
