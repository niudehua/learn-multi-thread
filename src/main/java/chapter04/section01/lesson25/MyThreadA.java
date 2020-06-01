package chapter04.section01.lesson25;

/**
 * @author: deng
 * @datetime: 2020/6/1 2:43 下午
 * @desc:
 */
public class MyThreadA extends Thread {
    private Service service;

    public MyThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.waitMethod();
    }
}
