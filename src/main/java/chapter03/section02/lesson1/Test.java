package chapter03.section02.lesson1;

/**
 * @author: deng
 * @datetime: 2020/5/29 10:59 下午
 * @desc:
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
//        Thread.sleep(?);
        System.out.println("我想当threadTest对象执行完毕后我再执行");
        System.out.println("但上面代码中的sleep()中的值应该写多少呢？");
        System.out.println("答案是：根据不能确定:)");
    }
}
