package chapter07.section05;

/**
 * @author: deng
 * @datetime: 2020/6/3 11:52 下午
 * @desc: setDefaultUncaughtExceptionHandler:设置在线程由于未捕获异常而突然终止时调用的默认处理程序，并且没有为该线程定义其他处理程序。 未捕获异常处理首先由线程控制，然后由线程的ThreadGroup对象控制，最后由默认的未捕获异常处理程序控制。如果线程没有显式的未捕获异常处理程序集，并且线程的线程组(包括父线程组)没有专门化它的uncaughtException方法，那么将调用默认处理程序的uncaughtException方法。 通过设置默认的未捕获异常处理程序，应用程序可以为那些已经接受系统提供的任何“默认”行为的线程更改未捕获异常的处理方式(例如记录到特定的设备或文件)。 注意，默认的未捕获异常处理程序通常不应该遵从线程的ThreadGroup对象，因为这可能会导致无限递归
 */
public class Main3 {
    public static void main(String[] args) {
        MyThread.setDefaultUncaughtExceptionHandler((t, e) -> {
            System.out.println("线程:" + t.getName() + " 出现了异常：");
            e.printStackTrace();

        });

        MyThread t1 = new MyThread();
        t1.setName("线程t1");
        t1.start();

        MyThread t2 = new MyThread();
        t2.setName("线程t2");
        t2.start();
    }
}
