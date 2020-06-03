package chapter07.section07;

/**
 * @author: deng
 * @datetime: 2020/6/4 12:06 上午
 * @desc:
 */
public class Run1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        // 对象
        myThread.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
        // 类
        MyThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
        myThread.start();
    }
}
