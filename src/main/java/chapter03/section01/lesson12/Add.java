package chapter03.section01.lesson12;

/**
 * @author: deng
 * @datetime: 2020/5/27 4:25 下午
 * @desc:
 */
public class Add {
    private String lock;

    public Add(String lock) {
        this.lock = lock;
    }

    public void add() {
        synchronized (lock) {
            ValueObject.list.add("anyString");
            lock.notifyAll();
        }
    }
}
