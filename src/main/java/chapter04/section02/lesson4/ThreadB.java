package chapter04.section02.lesson4;

/**
 * @author: deng
 * @datetime: 2020/6/1 4:14 下午
 * @desc:
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.write();
    }
}
