package chapter02.section02.lesson23;

/**
 * @author: deng
 * @datetime: 2020/5/24 12:06 上午
 * @desc:
 */
public class DealThread implements Runnable {
    public String username;
    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public void setFlag(String username) {
        this.username = username;

    }

    @Override
    public void run() {
        if (username.equals("a")) {
            synchronized (lock1) {
                try {
                    System.out.println("username = " + this.username);
                    Thread.sleep(3000);
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("lock1-->lock2 代码顺序执行");
                }
            }
        }
        if (username.equals("b")) {
            synchronized (lock2) {
                try {
                    System.out.println("username = " + this.username);
                    Thread.sleep(3000);
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                }
                synchronized (lock1) {
                    System.out.println("lock1-->lock2 代码顺序执行");
                }
            }
        }

    }
}