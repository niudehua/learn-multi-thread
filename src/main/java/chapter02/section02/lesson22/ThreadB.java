package chapter02.section02.lesson22;

/**
 * @author: deng
 * @datetime: 2020/5/23 11:37 下午
 * @desc:
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}
