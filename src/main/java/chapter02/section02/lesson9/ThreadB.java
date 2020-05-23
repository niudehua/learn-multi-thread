package chapter02.section02.lesson9;

/**
 * @author: deng
 * @datetime: 2020/5/22 9:00 上午
 * @desc:
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.b();
    }
}
