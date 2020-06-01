package chapter04.section02.lesson1;

/**
 * @author: deng
 * @datetime: 2020/6/1 3:52 下午
 * @desc:
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
    }
}
