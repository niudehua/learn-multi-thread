package chapter03.section01.lesson7;

/**
 * @author: deng
 * @datetime: 2020/5/25 4:18 下午
 * @desc:
 */
public class Service {
    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("wait begin : " + System.currentTimeMillis());
                lock.wait();
                System.out.println("wait end : " + System.currentTimeMillis());
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
