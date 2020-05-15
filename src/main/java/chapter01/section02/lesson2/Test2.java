package chapter01.section02.lesson2;

/**
 * @author: deng
 * @datetime: 2020/5/15 11:19 上午
 * @desc: 线程执行顺序与start方法顺序无关
 */
public class Test2 {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        myThread1.setName("myThread1");
        MyThread myThread2 = new MyThread();
        myThread2.setName("myThread2");
        MyThread myThread3 = new MyThread();
        myThread3.setName("myThread3");
        MyThread myThread4 = new MyThread();
        myThread4.setName("myThread4");
        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();

    }
}
