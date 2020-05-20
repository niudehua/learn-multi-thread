package chapter02.section01.lesson2;

/**
 * @author: deng
 * @datetime: 2020/5/19 11:35 下午
 * @desc: 如果多个线程访问同一个对象中的实力变量，则有可能出现"非线程安全"问题，可以通过在方法前加入synchronized关键字使方法成为同步方法
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum hasSelfPrivateNum = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(hasSelfPrivateNum);
        threadA.start();
        ThreadB threadB = new ThreadB(hasSelfPrivateNum);
        threadB.start();
    }
}
