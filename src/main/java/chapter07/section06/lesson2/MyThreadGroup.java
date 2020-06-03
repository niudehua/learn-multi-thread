package chapter07.section06.lesson2;

/**
 * @author: deng
 * @datetime: 2020/6/4 12:02 上午
 * @desc:
 */
public class MyThreadGroup extends ThreadGroup {
    public MyThreadGroup(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        super.uncaughtException(t, e);
        this.interrupt();
    }
}
