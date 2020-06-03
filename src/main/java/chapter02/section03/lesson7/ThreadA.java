package chapter02.section03.lesson7;

/**
 * @author: deng
 * @datetime: 2020/5/24 11:28 下午
 * @desc:
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.runMethod();
    }
}
