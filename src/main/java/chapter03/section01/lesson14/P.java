package chapter03.section01.lesson14;

/**
 * @author: deng
 * @datetime: 2020/5/27 5:26 下午
 * @desc:
 */
public class P {
    private final String lock;

    public P(String lock) {
        this.lock = lock;
    }

    public void setValue() {
        try {
            synchronized (lock) {
                if (!"".equals(ValueObject.value)) {
                    System.out.println("生产者-" + Thread.currentThread().getName() + " wait☆");
                    lock.wait();
                }
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("生产者-" + Thread.currentThread().getName() + " runnable");
                ValueObject.value = value;
                lock.notifyAll();
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
