package chapter02.section02.lesson15;

/**
 * @author: deng
 * @datetime: 2020/5/23 10:00 下午
 * @desc:
 */
public class Service {
    synchronized public static void printA() {
        try {
            System.out.println("线程名称：" + Thread.currentThread().getName() + "\t在" + System.currentTimeMillis() + "进入printA()");
            Thread.sleep(2000);
            System.out.println("线程名称：" + Thread.currentThread().getName() + "\t在" + System.currentTimeMillis() + "离开printA()");
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    synchronized public static void printB() {
        System.out.println("线程名称：" + Thread.currentThread().getName() + "\t在" + System.currentTimeMillis() + "进入printB()");
        System.out.println("线程名称：" + Thread.currentThread().getName() + "\t在" + System.currentTimeMillis() + "离开printB()");
    }
}
