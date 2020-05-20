package chapter01.section010.lesson1;

/**
 * @author: deng
 * @datetime: 2020/5/18 4:00 下午
 * @desc: 优先级的继承特性：在A线程中启动了B线程 那么B线程与A线程的优先等级一样
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("main 初始优先级：" + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main 设置后的优先级：" + Thread.currentThread().getPriority());
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
    }
}
