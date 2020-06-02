package chapter06.section06;

/**
 * @author: deng
 * @datetime: 2020/6/2 4:52 下午
 * @desc:
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(MyObject.connectionFactory.getConnection().hashCode());
        }
    }
}