package chapter07.section05;

/**
 * @author: deng
 * @datetime: 2020/6/3 11:47 下午
 * @desc: 线程中出现异常的处理
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        String username = null;
        System.out.println(username.hashCode());
    }
}
