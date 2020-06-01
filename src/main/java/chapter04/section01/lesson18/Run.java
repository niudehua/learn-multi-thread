package chapter04.section01.lesson18;

/**
 * @author: deng
 * @datetime: 2020/6/1 9:49 上午
 * @desc: isLocked()查询此锁是否由任何线程持有。此方法设计用于监视系统状态，而不是用于同步控制。
 */
public class Run {
    public static void main(String[] args) {
        final Service service1 = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service1.serviceMethod();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
