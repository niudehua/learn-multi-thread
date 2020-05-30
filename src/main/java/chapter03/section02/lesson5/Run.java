package chapter03.section02.lesson5;

/**
 * @author: deng
 * @datetime: 2020/5/30 12:02 上午
 * @desc: sleep(long) 与join(long)的区别：sleep不释放锁，join释放锁
 */
public class Run {

    public static void main(String[] args) {

        try {
            ThreadB b = new ThreadB();

            ThreadA a = new ThreadA(b);
            a.start();

            Thread.sleep(5000);

            ThreadC c = new ThreadC(b);
            c.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}