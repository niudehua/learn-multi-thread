package chapter01.section04.lesson2;

/**
 * @author: deng
 * @datetime: 2020/5/15 2:56 下午
 * @desc:
 */
public class CountOperate extends Thread {

    public CountOperate() {
        System.out.println("构造方法调用开始：");
        System.out.println("Thread.currentThread().getName():" + Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive():" + Thread.currentThread().isAlive());
        System.out.println("this.getName():" + this.getName());
        System.out.println("this.isAlive():" + this.isAlive());
        System.out.println("构造方法调用结束");
    }

    @Override
    public void run() {
        System.out.println("run方法调用开始：");
        System.out.println("Thread.currentThread().getName():" + Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive():" + Thread.currentThread().isAlive());
        System.out.println("this.getName():" + this.getName());
        System.out.println("this.isAlive():" + this.isAlive());
        System.out.println("run方法调用结束");
    }
}
