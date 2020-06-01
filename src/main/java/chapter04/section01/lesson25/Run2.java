package chapter04.section01.lesson25;

/**
 * @author: deng
 * @datetime: 2020/6/1 2:44 下午
 * @desc:
 */
public class Run2 {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        MyThreadA myThreadA = new MyThreadA(service);
        myThreadA.start();

        Thread.sleep(2000);

        MyThreadB myThreadB = new MyThreadB(service);
        myThreadB.start();
    }
}
