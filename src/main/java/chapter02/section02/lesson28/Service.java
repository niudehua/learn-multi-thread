package chapter02.section02.lesson28;

/**
 * @author: deng
 * @datetime: 2020/5/24 1:54 上午
 * @desc:
 */
public class Service {
    private String lock = "123";

    public void testMethod() {
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " begin time:" + System.currentTimeMillis());
            lock = "456";
            try {
                Thread.sleep(3000);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " end time:" + System.currentTimeMillis());

        }
    }
}
