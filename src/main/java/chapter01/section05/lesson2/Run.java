package chapter01.section05.lesson2;

/**
 * @author: deng
 * @datetime: 2020/5/15 3:35 下午
 * @desc: 查看start
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println("调用start方法前：" + System.currentTimeMillis());
        myThread.start();
        System.out.println("调用start方法后：" + System.currentTimeMillis());

    }
}
