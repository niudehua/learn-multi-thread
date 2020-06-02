package chapter07.section01.lesson1;


/**
 * @author: deng
 * @datetime: 2020/6/2 10:48 下午
 * @desc: NEW：线程实例化，还未执行start()方法时的状态 RUNNABLE：线程进入运行的状态 TERMINATED：线程被销毁时的状态
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            System.out.println("main 方法中的状态1：" + myThread.getState());
            Thread.sleep(1000);
            myThread.start();
            Thread.sleep(1000);
            System.out.println("main 方法中的状态2：" + myThread.getState());
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
