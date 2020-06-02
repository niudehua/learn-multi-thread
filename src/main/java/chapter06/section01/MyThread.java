package chapter06.section01;

/**
 * @author: deng
 * @datetime: 2020/6/2 3:26 下午
 * @desc:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
