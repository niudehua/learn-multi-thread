package chapter01.section02.lesson3;

/**
 * @author: deng
 * @datetime: 2020/5/15 11:26 上午
 * @desc: 通过实现Runnable接口创建线程
 */
public class Run {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        System.out.println(thread.getName());
        String name = Thread.currentThread().getName();
        System.out.println(name);
        System.out.println("运行结束");
    }
}
