package chapter01.section05.lesson1;

/**
 * @author: deng
 * @datetime: 2020/5/15 3:35 下午
 * @desc: 直接看run方法
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println("调用run方法前：" + System.currentTimeMillis());
        myThread.run();
        System.out.println("调用run方法后：" + System.currentTimeMillis());
    }
}
