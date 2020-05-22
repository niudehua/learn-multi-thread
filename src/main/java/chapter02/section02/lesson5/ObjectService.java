package chapter02.section02.lesson5;

/**
 * @author: deng
 * @datetime: 2020/5/21 9:44 下午
 * @desc:
 */
public class ObjectService {
    public void serviceMethodA() {
        try {
            synchronized (this) {
                System.out.println("serviceMethodA begin:" + System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("serviceMethodA end:" + System.currentTimeMillis());
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    public void serviceMethodB() {
        synchronized (this) {
            System.out.println("serviceMethodB begin:" + System.currentTimeMillis());
            System.out.println("serviceMethodB end:" + System.currentTimeMillis());

        }
    }
}
