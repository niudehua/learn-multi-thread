package chapter03.section01.lesson6;

/**
 * @author: deng
 * @datetime: 2020/5/25 3:42 下午
 * @desc:
 */
public class NotifyThread extends Thread{
    private Object lock;

    public NotifyThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.synNotifyMethod(lock);
    }
}
