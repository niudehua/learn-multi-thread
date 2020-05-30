package chapter03.section01.lesson5;

/**
 * @author: deng
 * @datetime: 2020/5/25 3:23 下午
 * @desc: 调用了wait()方法 如果不唤醒 会一直等待
 */
public class Service {
    public void testMethod(Object lock) {
        synchronized (lock) {
            try {
                System.out.println(Thread.currentThread().getName() + "--wait 前 ：" + System.currentTimeMillis());
                lock.wait();
                System.out.println(Thread.currentThread().getName() + "--wait 后 ：" + System.currentTimeMillis());
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }
}
