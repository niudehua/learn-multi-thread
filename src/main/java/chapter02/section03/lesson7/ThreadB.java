package chapter02.section03.lesson7;

/**
 * @author: deng
 * @datetime: 2020/5/24 11:28 下午
 * @desc:
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.stopMethod();
    }
}
