package chapter01.section02.lesson5;

/**
 * @author: deng
 * @datetime: 2020/5/15 12:38 下午
 * @desc: 在run方法上添加synchronized关键字给方法上锁
 */
public class MyThread2 extends Thread {
   private  int count = 5;
    @Override
   synchronized public void run() {
        super.run();
        count--;
        System.out.println(currentThread().getName() + "计算：" + count);

    }
}
