package chapter01.section010.lesson3;

/**
 * @author: deng
 * @datetime: 2020/5/19 3:48 下午
 * @desc: 优先级具有随机性：不能把线程的优先级与运行结果作为衡量的标准，优先级高的线程并不一定每一次都先执行完run()方法中的任务
 */
public class Run {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread1 myThread1 = new MyThread1();
            myThread1.setPriority(5);
            myThread1.start();
            MyThread2 myThread2 = new MyThread2();
            myThread2.setPriority(6);
            myThread2.start();

        }
    }
}
