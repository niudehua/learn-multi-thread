package chapter02.section01.lesson7;

/**
 * @author: deng
 * @datetime: 2020/5/21 10:45 上午
 * @desc:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
}
