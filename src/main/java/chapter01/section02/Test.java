package chapter01.section02;

/**
 * @author: deng
 * @datetime: 2020/5/15 10:39 上午
 * @desc: 一个进程在运行时至少有一个线程在运行
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
    }
}
