package chapter07.section06.lesson2;

/**
 * @author: deng
 * @datetime: 2020/6/4 12:03 上午
 * @desc: 线程组内处理异常
 */
public class Run {
    public static void main(String[] args) {
        MyThreadGroup group = new MyThreadGroup("我的线程组");
        MyThread[] myThread = new MyThread[10];
        for (int i = 0; i < myThread.length; i++) {
            myThread[i] = new MyThread(group, "线程" + (i + 1), "1");
            myThread[i].start();
        }
        MyThread newT = new MyThread(group, "报错线程", "a");
        newT.start();
    }
}
