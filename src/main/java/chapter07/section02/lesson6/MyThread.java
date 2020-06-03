package chapter07.section02.lesson6;

/**
 * @author: deng
 * @datetime: 2020/6/3 3:59 下午
 * @desc:
 */
public class MyThread extends Thread {
    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        System.out.println("ThreadName=" + Thread.currentThread().getName()
                + "准备开始死循环了：)");
        while (!this.isInterrupted()) {
        }
        System.out.println("ThreadName=" + Thread.currentThread().getName()
                + "结束了：)");
    }
}
