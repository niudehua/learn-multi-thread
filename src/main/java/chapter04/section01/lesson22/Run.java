package chapter04.section01.lesson22;

/**
 * @author: deng
 * @datetime: 2020/6/1 11:03 上午
 * @desc: tryLock(timeout, timeunit)如果在给定的等待时间内没有其他线程持有该锁，并且当前线程没有被中断，则获取该锁。
 */
public class Run {
    public static void main(String[] args) {
        final MyService service = new MyService();

        Runnable runnableRef = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()
                        + "调用waitMethod时间：" + System.currentTimeMillis());
                service.waitMethod();
            }
        };

        Thread threadA = new Thread(runnableRef);
        threadA.setName("A");
        threadA.start();
        Thread threadB = new Thread(runnableRef);
        threadB.setName("B");
        threadB.start();
    }
}
