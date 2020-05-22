package chapter02.section02.lesson2;

/**
 * @author: deng
 * @datetime: 2020/5/21 7:51 下午
 * @desc:
 */
public class ThreadA extends Thread{
    private final ObjectService objectService;

    public ThreadA(ObjectService objectService) {
        this.objectService = objectService;
    }

    @Override
    public void run() {
        objectService.serviceMethod();
    }
}
