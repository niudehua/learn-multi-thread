package chapter03.section01.lesson14;

/**
 * @author: deng
 * @datetime: 2020/5/27 5:26 下午
 * @desc:
 */
public class C {
    private final String lock;

    public C(String lock) {
        this.lock = lock;
    }

    public void getValue() {
        try {
            synchronized (lock) {
                if ("".equals(ValueObject.value)) {
                    System.out.println("消费者" + Thread.currentThread().getName() + " wait★");
                    lock.wait();
                }
                System.out.println("消费者" + Thread.currentThread().getName() + " runnable");
                ValueObject.value = "";
                lock.notifyAll();
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
