package chapter07.section06.lesson1;

/**
 * @author: deng
 * @datetime: 2020/6/3 11:58 下午
 * @desc: 默认情况下线程组中的一个线程出现异常不会影响其它线程的运行
 */
public class Run {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("我的线程组");
        MyThread[] myThread = new MyThread[10];
        for (int i = 0; i < myThread.length; i++) {
            myThread[i] = new MyThread(group, "线程" + (i + 1), "1");
            myThread[i].start();
        }
        MyThread newT = new MyThread(group, "报错线程", "a");
        newT.start();
    }
}
