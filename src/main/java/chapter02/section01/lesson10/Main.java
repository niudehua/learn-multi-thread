package chapter02.section01.lesson10;

/**
 * @author: deng
 * @datetime: 2020/5/21 2:14 下午
 * @desc:
 */
public class Main {
    synchronized public void testMethod() {
        try {
            System.out.println("main-ThreadName:" + Thread.currentThread().getName() + "\tcurrentTime:" + System.currentTimeMillis());
            Thread.sleep(1000);
            System.out.println("mian-sleep--ThreadName:" + Thread.currentThread().getName() + "\tcurrentTime:" + System.currentTimeMillis());
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
