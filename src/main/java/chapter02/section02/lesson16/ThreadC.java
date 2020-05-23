package chapter02.section02.lesson16;

/**
 * @author: deng
 * @datetime: 2020/5/23 10:07 下午
 * @desc:
 */
public class ThreadC extends Thread {
    private Service service;

    public ThreadC(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.printC();
    }
}
