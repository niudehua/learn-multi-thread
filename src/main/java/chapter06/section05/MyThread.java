package chapter06.section05;

/**
 * @author: deng
 * @datetime: 2020/6/2 3:26 下午
 * @desc:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(MyObject.getInstance().hashCode());
        }
    }
}
