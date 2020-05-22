package chapter02.section02.lesson7;

/**
 * @author: deng
 * @datetime: 2020/5/21 10:33 下午
 * @desc:
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.setUsernameAndPassword("b", "bb");
    }
}
