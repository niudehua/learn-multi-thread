package chapter07.section07;

/**
 * @author: deng
 * @datetime: 2020/6/4 12:05 上午
 * @desc:
 */
public class MyThread extends Thread {
    private String num = "a";

    public MyThread() {
        super();
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        int numInt = Integer.parseInt(num);
        System.out.println("在线程中打印：" + (numInt + 1));
    }

}
