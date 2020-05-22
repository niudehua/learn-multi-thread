package chapter02.section02.lesson4;

/**
 * @author: deng
 * @datetime: 2020/5/21 9:28 下午
 * @desc:
 */
public class Task {
    public void doLongTimeTask() {
        for (int i = 0; i < 100; i++) {
            System.out.println("noSynchronized ThreadName:" + Thread.currentThread().getName() + "\ti=" + (i + 1));
        }
        System.out.println("");
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                System.out.println("synchronized ThreadName:" + Thread.currentThread().getName() + "\ti=" + (i + 1));
            }
        }
    }
}
