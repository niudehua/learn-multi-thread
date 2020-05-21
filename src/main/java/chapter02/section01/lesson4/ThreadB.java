package chapter02.section01.lesson4;

/**
 * @author: deng
 * @datetime: 2020/5/20 4:47 下午
 * @desc:
 */
public class ThreadB extends Thread{
    private MyObject myObject;

    public ThreadB(MyObject myObject) {
        this.myObject = myObject;
    }

    @Override
    public void run() {
        myObject.methodA();
    }
}
