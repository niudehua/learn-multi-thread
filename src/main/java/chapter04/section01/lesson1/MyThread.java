package chapter04.section01.lesson1;

/**
 * @author: deng
 * @datetime: 2020/5/30 3:21 下午
 * @desc:
 */
public class MyThread extends Thread {

    private MyService service;

    public MyThread(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
