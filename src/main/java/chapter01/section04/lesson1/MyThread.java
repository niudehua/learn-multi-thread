package chapter01.section04.lesson1;

/**
 * @author: deng
 * @datetime: 2020/5/15 2:52 下午
 * @desc:
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("执行run方法时：" + isAlive());
    }
}
