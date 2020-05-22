package chapter02.section02.lesson5;

/**
 * @author: deng
 * @datetime: 2020/5/21 9:47 下午
 * @desc:
 */
public class ThreadB extends Thread {
    private ObjectService objectService;

    public ThreadB(ObjectService objectService) {
        this.objectService = objectService;
    }

    @Override
    public void run() {
        objectService.serviceMethodB();
    }
}
