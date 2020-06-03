package chapter07.section07;

/**
 * @author: deng
 * @datetime: 2020/6/4 12:05 上午
 * @desc:
 */
public class MyThreadGroup extends ThreadGroup {
    public MyThreadGroup(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        super.uncaughtException(t, e);
        System.out.println("线程组的异常处理");
        e.printStackTrace();
    }
}
