package chapter03.section02.lesson7;

/**
 * @author: deng
 * @datetime: 2020/5/30 9:46 上午
 * @desc:
 */
public class RunFirst {

    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        ThreadA a = new ThreadA(b);
        a.start();
        b.start();
        System.out.println("   main end=" + System.currentTimeMillis());
    }

}