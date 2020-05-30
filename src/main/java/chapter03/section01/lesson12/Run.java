package chapter03.section01.lesson12;


/**
 * @author: deng
 * @datetime: 2020/5/27 5:11 下午
 * @desc: subtractThread1和subtractThread2两个线程同时执行remove() 解决方法：将subtract()方法中的if判断改为while循环判断
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        String lock = "";
        Add add = new Add(lock);
        Subtract subtract = new Subtract(lock);

        ThreadB subtractThread1 = new ThreadB(subtract);
        subtractThread1.setName("subtract Thread1");
        subtractThread1.start();

        ThreadB subtractThread2 = new ThreadB(subtract);
        subtractThread2.setName("subtract Thread2");
        subtractThread2.start();

        Thread.sleep(1000);
        ThreadA addThread = new ThreadA(add);
        addThread.setName("add Thread");
        addThread.start();
        //Exception in thread "subtract Thread1" java.lang.IndexOutOfBoundsException: Index: 0, Size: 0

    }
}
