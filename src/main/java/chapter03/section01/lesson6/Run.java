package chapter03.section01.lesson6;

/**
 * @author: deng
 * @datetime: 2020/5/25 3:44 下午
 * @desc: 必须执行完notify()方法所在的同步synchronized代码块后才释放锁
 */
public class Run {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA threadA = new ThreadA(lock);
        threadA.setName("threadA");
        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.setName("notifyThread");
        SynNotifyMethodThread synNotifyMethodThread = new SynNotifyMethodThread(lock);
        synNotifyMethodThread.setName("synNotifyMethodThreadRR");
        threadA.start();
        notifyThread.start();
        synNotifyMethodThread.start();
    }
}
