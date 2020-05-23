package chapter02.section02.lesson18;

/**
 * @author: deng
 * @datetime: 2020/5/23 10:00 下午
 * @desc:
 */
public class Service {
    public static void printA() {
        synchronized (Service.class) {
            try {
                System.out.println("线程名称：" + Thread.currentThread().getName() + "\t在" + System.currentTimeMillis() + "进入printA()");
                Thread.sleep(2000);
                System.out.println("线程名称：" + Thread.currentThread().getName() + "\t在" + System.currentTimeMillis() + "离开printA()");
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }

        }
    }

    public static void printB() {
        synchronized (Service.class) {
            System.out.println("线程名称：" + Thread.currentThread().getName() + "\t在" + System.currentTimeMillis() + "进入printB()");
            System.out.println("线程名称：" + Thread.currentThread().getName() + "\t在" + System.currentTimeMillis() + "离开printB()");

        }
    }


}
