package chapter02.section01.lesson6;

/**
 * @author: deng
 * @datetime: 2020/5/21 9:58 上午
 * @desc:
 */
public class ThreadA extends Thread {
    private PublicVar publicVar;

    public ThreadA(PublicVar publicVar) {
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        System.out.println("ThreadA run() begin");
        publicVar.setValue("B", "bbb");
        System.out.println("ThreadA run() end");
    }
}
