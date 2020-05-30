package chapter03.section02.lesson2;

/**
 * @author: deng
 * @datetime: 2020/5/29 10:59 下午
 * @desc: join()方法的作用是使所属线程对象x的run()方法正常执行，而使当前线程z进行无限期的阻塞，等线程x销毁后再继续执行线程z后面的代码
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.join();
        System.out.println("我想当threadTest对象执行完毕后我再执行,我做到了");
    }
}
