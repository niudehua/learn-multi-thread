package chapter01.section010.lesson3;

import java.util.Random;

/**
 * @author: deng
 * @datetime: 2020/5/19 3:44 下午
 * @desc:
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        long begin = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            Random random = new Random();
            random.nextInt();
        }
        long end = System.currentTimeMillis();
        System.out.println("☆☆☆☆☆MyThead2花费☆☆☆☆☆:" + (end - begin) + "毫秒");
    }
}
