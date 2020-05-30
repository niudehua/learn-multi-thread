package chapter03.section01.lesson8;

/**
 * @author: deng
 * @datetime: 2020/5/25 4:46 下午
 * @desc:
 */
public class Service {
    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + "--wait begin time " + System.currentTimeMillis());
                lock.wait();
                System.out.println(Thread.currentThread().getName() + "--wait end time " + System.currentTimeMillis());
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
