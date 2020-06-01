package chapter04.section01.lesson24;

/**
 * @author: deng
 * @datetime: 2020/6/1 11:28 上午
 * @desc: awaitUninterruptibly()导致当前线程等待，直到它被通知。 与此条件相关的锁被原子释放，当前线程出于线程调度目的被禁用，并处于休眠状态，直到发生以下三种情况之一: 其他一些线程调用此条件的信号方法，而当前线程恰好被选择为要唤醒的线程;或 其他一些线程调用signalAll方法来处理这个条件;或 一个“虚假的觉醒”发生了。 在所有情况下，在此方法返回之前，当前线程必须重新获取与此条件关联的锁。当线程返回时，它保证持有这个锁。 如果当前线程的中断状态是在它进入此方法时设置的，或者是在等待时中断的，那么它将继续等待，直到发出信号。当它最终从这个方法返回时，它的中断状态仍然会被设置。 实现注意事项 当调用此方法时，假定当前线程持有与此条件关联的锁。这取决于实现来确定情况是否如此，如果不是，如何响应。通常，会抛出一个异常(比如IllegalMonitorStateException)，实现必须记录这个事实。
 */
public class Run {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            MyThread myThread = new MyThread(service);
            myThread.start();
            Thread.sleep(3000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
