package chapter07.section06.lesson1;

/**
 * @author: deng
 * @datetime: 2020/6/3 11:57 下午
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
        while (true) {
            System.out.println("死循环中：" + Thread.currentThread().getName());
        }

    }
}
