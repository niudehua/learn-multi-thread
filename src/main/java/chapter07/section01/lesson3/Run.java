package chapter07.section01.lesson3;

/**
 * @author: deng
 * @datetime: 2020/6/2 11:30 下午
 * @desc: BLOCKED出现在某一线程等待锁释放的时候
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThreadA myThreadA = new MyThreadA();
            myThreadA.setName("myThreadA");
            myThreadA.start();
            MyThreadB myThreadB = new MyThreadB();
            myThreadB.setName("myThreadB");
            myThreadB.start();
            Thread.sleep(1);
            System.out.println("main 方法中 myThreadA 的状态：" + myThreadA.getState());
            System.out.println("main 方法中 myThreadB 的状态：" + myThreadB.getState());
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
