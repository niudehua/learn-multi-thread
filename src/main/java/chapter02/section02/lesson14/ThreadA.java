package chapter02.section02.lesson14;

/**
 * @author: deng
 * @datetime: 2020/5/23 9:21 下午
 * @desc:
 */
public class ThreadA extends Thread {
    private Service service;
    private MyObject myObject;

    public ThreadA(Service service, MyObject myObject) {
        this.service = service;
        this.myObject = myObject;
    }

    @Override
    public void run() {
        service.testMethod1(myObject);
    }
}
