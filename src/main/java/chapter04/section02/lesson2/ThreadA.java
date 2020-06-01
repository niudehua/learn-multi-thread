package chapter04.section02.lesson2;

/**
 * @author: deng
 * @datetime: 2020/6/1 4:14 下午
 * @desc:
 */
public class ThreadA extends Thread{
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.write();
    }
}
