package chapter07.section06.lesson2;

/**
 * @author: deng
 * @datetime: 2020/6/4 12:02 上午
 * @desc:
 */
public class MyThread extends Thread {
    private String num;

    public MyThread(ThreadGroup group, String name, String num) {
        super(group, name);
        this.num = num;
    }

    @Override
    public void run() {
        int numInt = Integer.parseInt(num);
        while (this.isInterrupted() == false) {
            System.out.println("死循环中：" + Thread.currentThread().getName());
        }
    }
}
