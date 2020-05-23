package chapter02.section02.lesson13;

/**
 * @author: deng
 * @datetime: 2020/5/23 9:21 下午
 * @desc:
 */
public class ThreadB extends Thread {
    private MyObject myObject;

    public ThreadB(MyObject myObject) {
        this.myObject = myObject;
    }

    @Override
    public void run() {
        myObject.speedPrintString();
    }
}
