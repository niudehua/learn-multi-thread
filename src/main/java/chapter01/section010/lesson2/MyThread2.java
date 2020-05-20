package chapter01.section010.lesson2;

import java.util.Random;

/**
 * @author: deng
 * @datetime: 2020/5/18 4:27 下午
 * @desc:
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        long begin = System.currentTimeMillis();
        long addResult = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5000; j++) {
                Random random = new Random();
                random.nextInt();
                addResult = addResult + j;
            }
            long end = System.currentTimeMillis();
            System.out.println("☆☆☆☆☆MyThread2 花费时间☆☆☆☆☆" + (end - begin) + "毫秒");
        }
    }
}
