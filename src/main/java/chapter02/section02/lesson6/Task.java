package chapter02.section02.lesson6;

/**
 * @author: deng
 * @datetime: 2020/5/21 9:56 下午
 * @desc:
 */
public class Task {
    synchronized public void otherMethod() {
        System.out.println("otherMethod():" + Thread.currentThread().getName());
    }

    public void doLongTimeTask() {
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                System.out.println("doLongTimeTask():" + Thread.currentThread().getName() + "\ti=" + (i + 1));
            }
        }


    }
}
