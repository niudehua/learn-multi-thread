package chapter02.section02.lesson21;

/**
 * @author: deng
 * @datetime: 2020/5/23 11:36 下午
 * @desc:
 */
public class Service {
    synchronized public void methodA() {
        boolean isConnect = true;
        System.out.println("methodA() begin");
        while (isConnect) {

        }
        System.out.println("methodA() end");
    }

    synchronized public void methodB() {
        System.out.println("methodB() begin");
        System.out.println("methodB() end");

    }
}
