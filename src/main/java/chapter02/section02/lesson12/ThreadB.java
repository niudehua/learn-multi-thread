package chapter02.section02.lesson12;

/**
 * @author: deng
 * @datetime: 2020/5/23 9:06 下午
 * @desc:
 */
public class ThreadB extends Thread {
    private final Service service;
    private final MyObject myObject;

    public ThreadB(Service service, MyObject myObject) {
        this.service = service;
        this.myObject = myObject;
    }

    @Override
    public void run() {
        service.testMethod1(myObject);
    }
}