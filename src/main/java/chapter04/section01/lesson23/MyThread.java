package chapter04.section01.lesson23;

/**
 * @author: deng
 * @datetime: 2020/6/1 11:28 上午
 * @desc:
 */
public class MyThread extends Thread{
    private Service service;

    public MyThread(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }

}
