package chapter02.section02.lesson2;

/**
 * @author: deng
 * @datetime: 2020/5/21 7:48 下午
 * @desc:
 */
public class ObjectService {
    public void serviceMethod() {
        synchronized (this) {
            try {
                System.out.println("begin task:" + System.currentTimeMillis() + "\tThreadName:" + Thread.currentThread().getName());
                Thread.sleep(3000);
                System.out.println("end task:" + System.currentTimeMillis() + "\tThreadName:" + Thread.currentThread().getName());
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }
}
