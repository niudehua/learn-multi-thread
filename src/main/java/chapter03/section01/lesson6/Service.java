package chapter03.section01.lesson6;

/**
 * @author: deng
 * @datetime: 2020/5/25 3:37 下午
 * @desc:
 */
public class Service {
    public void testMethod(Object lock) {
        synchronized (lock) {
            try {
                System.out.println(Thread.currentThread().getName() + "---wait begin : " + System.currentTimeMillis());
                lock.wait();
                System.out.println(Thread.currentThread().getName() + "---wait end : " + System.currentTimeMillis());
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }


    public void synNotifyMethod(Object lock) {
        synchronized (lock) {
            try {
                System.out.println(Thread.currentThread().getName() + "---begin notify : " + System.currentTimeMillis());
                lock.notify();
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() + "---end notify : " + System.currentTimeMillis());
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }

    }
}
