package chapter02.section01.lesson3;

/**
 * @author: deng
 * @datetime: 2020/5/19 11:35 下午
 * @desc: 多个对象多个锁
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum hasSelfPrivateNum1 = new HasSelfPrivateNum();
        HasSelfPrivateNum hasSelfPrivateNum2 = new HasSelfPrivateNum();

        ThreadA threadA = new ThreadA(hasSelfPrivateNum1);
        threadA.start();
        ThreadB threadB = new ThreadB(hasSelfPrivateNum2);
        threadB.start();
    }
}
