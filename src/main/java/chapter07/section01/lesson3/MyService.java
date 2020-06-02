package chapter07.section01.lesson3;

/**
 * @author: deng
 * @datetime: 2020/6/2 11:28 下午
 * @desc:
 */
public class MyService {
    synchronized public static void serviceMethod() {
        try {
            System.out.println(Thread.currentThread().getName() + "进入了业务方法");
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
