package chapter04.section01.lesson25;

/**
 * @author: deng
 * @datetime: 2020/6/1 2:44 下午
 * @desc:
 */
public class MyThreadB extends Thread{
    private Service service;

    public MyThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.notifyMethod();
    }
}
