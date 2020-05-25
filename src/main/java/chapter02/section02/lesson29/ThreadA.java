package chapter02.section02.lesson29;

/**
 * @author: deng
 * @datetime: 2020/5/24 10:50 上午
 * @desc:
 */
public class ThreadA extends Thread {
    private Service service;
    private UserInfo userInfo;

    public ThreadA(Service service, UserInfo userInfo) {
        this.service = service;
        this.userInfo = userInfo;
    }

    @Override
    public void run() {
        service.serviceMethodA(userInfo);
    }
}
