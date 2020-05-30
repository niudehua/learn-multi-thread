package chapter03.section01.lesson14;

/**
 * @author: deng
 * @datetime: 2020/5/27 5:35 下午
 * @desc: 多生产与多消费：使用notifyAll()方法 唤醒所有wait 防止出现假死状态
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        String lock = "lock";
        P p = new P(lock);
        C c = new C(lock);
//        ThreadA[] pThreads = new ThreadA[2];
        ThreadA pThread = new ThreadA(p);
        pThread.setName("pThread");
        pThread.start();
        ThreadB[] cThreads = new ThreadB[5];
        for (int i = 0; i < 5; i++) {
//            pThreads[i] = new ThreadA(p);
//            pThreads[i].setName("pThread" + (i + 1));
            cThreads[i] = new ThreadB(c);
            cThreads[i].setName("cThread" + (i + 1));
//            pThreads[i].start();
//            Thread.sleep(1000);
            cThreads[i].start();
        }
        Thread.sleep(5000);
        Thread[] threads = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threads);

        for (int i = 0; i < threads.length; i++) {
            System.out.println(threads[i].getName() + "-" + threads[i].getState());
        }

    }
}
