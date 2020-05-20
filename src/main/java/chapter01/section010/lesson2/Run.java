package chapter01.section010.lesson2;

/**
 * @author: deng
 * @datetime: 2020/5/18 4:45 下午
 * @desc:  优先级具有规则性：高优先级的线程总是大部分先执行完，不代表高优先级的线程全部先执行完
 */
public class Run {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread1 myThread1 = new MyThread1();
            myThread1.setPriority(10);
            myThread1.start();
            MyThread2 myThread2 = new MyThread2();
            myThread2.setPriority(1);
            myThread2.start();
        }
    }
}
