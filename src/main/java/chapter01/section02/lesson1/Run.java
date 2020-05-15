package chapter01.section02.lesson1;

/**
 * @author: deng
 * @datetime: 2020/5/15 10:55 上午
 * @desc: 多线程调用
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
//        myThread.start(); 多次对同一个异常调用start方法 java.lang.IllegalThreadStateException
        System.out.println("运行结束");
        //在多线程中，执行顺序跟代码顺序无关
    }
}
