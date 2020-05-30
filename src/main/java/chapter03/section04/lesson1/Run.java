package chapter03.section04.lesson1;

/**
 * @author: deng
 * @datetime: 2020/5/30 2:53 下午
 * @desc: InheritableThreadLocal 值继承
 */
public class Run {

    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("   在Main线程中取值=" + Tools.inheritableThreadLocalExt.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            ThreadA a = new ThreadA();
            a.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}