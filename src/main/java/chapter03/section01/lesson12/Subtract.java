package chapter03.section01.lesson12;

/**
 * @author: deng
 * @datetime: 2020/5/27 4:30 下午
 * @desc:
 */
public class Subtract {
    private String lock;

    public Subtract(String lock) {
        this.lock = lock;
    }

    public void subtract() {
        try {
            synchronized (lock) {
//                if (ValueObject.list.size() == 0) {
                while (ValueObject.list.size() == 0) {
                    System.out.println("wait begin ThreadName = " + Thread.currentThread().getName());
                    lock.wait();
                    System.out.println("wait end ThreadName = " + Thread.currentThread().getName());
                }
                ValueObject.list.remove(0);
                System.out.println("list size = " + ValueObject.list.size());
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
