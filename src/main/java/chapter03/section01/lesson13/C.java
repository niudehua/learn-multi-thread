package chapter03.section01.lesson13;

/**
 * @author: deng
 * @datetime: 2020/5/27 5:26 下午
 * @desc:
 */
public class C {
    private String lock;

    public C(String lock) {
        this.lock = lock;
    }

    public void getValue() {
        try {
            synchronized (lock) {
                if ("".equals(ValueObject.value)) {
                    lock.wait();
                }
                System.out.println("getValue = " + ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
