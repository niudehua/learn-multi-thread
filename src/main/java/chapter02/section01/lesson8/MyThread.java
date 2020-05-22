package chapter02.section01.lesson8;

/**
 * @author: deng
 * @datetime: 2020/5/21 11:06 上午
 * @desc:
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        Sub sub = new Sub();
        sub.operateIMainMethod();
    }
}
