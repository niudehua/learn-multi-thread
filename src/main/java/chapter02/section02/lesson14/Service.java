package chapter02.section02.lesson14;


/**
 * @author: deng
 * @datetime: 2020/5/23 9:02 下午
 * @desc:
 */
public class Service {
    public void testMethod1(MyObject myObject) {
        synchronized (myObject) {
            try {
                System.out.println("testMethod1 getLock:" + System.currentTimeMillis() + "\trun ThreadName:" + Thread.currentThread().getName());
                Thread.sleep(3000);
                System.out.println("testMethod1 releaseLock:" + System.currentTimeMillis() + "\trun ThreadName:" + Thread.currentThread().getName());
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }
}
