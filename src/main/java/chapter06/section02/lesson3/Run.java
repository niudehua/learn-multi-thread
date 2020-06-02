package chapter06.section02.lesson3;

/**
 * @author: deng
 * @datetime: 2020/6/2 3:27 下午
 * @desc: 此方法加入同步synchronized关键字得到相同实例的对象，但这种方法效率底下，是同步运行的，下个线程想要获得对象，要等上一个线程先释放锁之后才能继续执行
 */
public class Run {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.start();
        t2.start();
        t3.start();
    }
}
