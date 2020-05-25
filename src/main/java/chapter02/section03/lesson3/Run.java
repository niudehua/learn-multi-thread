package chapter02.section03.lesson3;

/**
 * @author: deng
 * @datetime: 2020/5/24 11:32 上午
 * @desc: volatile 的作用是强制从公共堆栈中获取变量的值，而不是从线程私有堆栈中获取
 */
public class Run {

    public static void main(String[] args) {
        RunThread runThread = new RunThread();
        runThread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        runThread.setRunning(false);
        System.out.println("已经赋值为false");
    }
}
