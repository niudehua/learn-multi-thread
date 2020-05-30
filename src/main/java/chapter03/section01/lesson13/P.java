package chapter03.section01.lesson13;

/**
 * @author: deng
 * @datetime: 2020/5/27 5:26 下午
 * @desc:
 */
public class P {
    private String lock;

    public P(String lock) {
        this.lock = lock;
    }

    public void setValue() {
        try {
            synchronized (lock) {
                if (!"".equals(ValueObject.value)) {
                    lock.wait();
                }
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("setValue = " + value);
                ValueObject.value = value;
                lock.notify();
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
