package chapter01.section08.lesson3;

/**
 * @author: deng
 * @datetime: 2020/5/18 9:29 上午
 * @desc: 当程序运行到print()内部停止时同步锁未被释放
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(10);
            myThread.suspend();
            System.out.println("main end");
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
