package chapter04.section01.lesson20;

/**
 * @author: deng
 * @datetime: 2020/6/1 10:36 上午
 * @desc: lockInterruptibly()获取锁，除非当前线程中断
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final MyService service = new MyService();
        Runnable runnableRef = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };

        Thread threadA = new Thread(runnableRef);
        threadA.setName("A");
        threadA.start();
        Thread.sleep(500);
        Thread threadB = new Thread(runnableRef);
        threadB.setName("B");
        threadB.start();
        threadB.interrupt();
    }
}
