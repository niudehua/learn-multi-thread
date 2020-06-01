package chapter04.section01.lesson21;

/**
 * @author: deng
 * @datetime: 2020/6/1 10:55 上午
 * @desc: tryLock() 仅当锁在调用时不被其他线程持有时才获取锁
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
        Thread threadB = new Thread(runnableRef);
        threadB.setName("B");
        threadB.start();
    }
}
