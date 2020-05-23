package chapter02.section02.lesson22;

/**
 * @author: deng
 * @datetime: 2020/5/23 11:36 下午
 * @desc:
 */
public class Service {
    Object object1 = new Object();

    public void methodA() {
        synchronized (object1) {
            boolean isConnect = true;
            System.out.println("methodA() begin");
            while (isConnect) {

            }
            System.out.println("methodA() end");

        }
    }

    Object object2 = new Object();

    public void methodB() {
        synchronized (object2) {
            System.out.println("methodB() begin");
            System.out.println("methodB() end");
        }
    }
}
