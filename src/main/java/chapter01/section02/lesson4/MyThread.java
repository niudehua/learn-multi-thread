package chapter01.section02.lesson4;

/**
 * @author: deng
 * @datetime: 2020/5/15 11:47 上午
 * @desc:
 */
public class MyThread extends Thread {
   int count = 5;

    public MyThread(String name) {
        currentThread().setName(name);
    }

    @Override
    public void run() {
        while (count > 0) {
            System.out.println(currentThread().getName() + "计算:" + count);
            count--;
        }

    }
}
