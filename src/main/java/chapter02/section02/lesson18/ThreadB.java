package chapter02.section02.lesson18;

/**
 * @author: deng
 * @datetime: 2020/5/23 10:03 下午
 * @desc:
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.printB();
    }
}
