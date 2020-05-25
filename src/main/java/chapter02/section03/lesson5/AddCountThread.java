package chapter02.section03.lesson5;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: deng
 * @datetime: 2020/5/24 10:57 下午
 * @desc:
 */
public class AddCountThread extends Thread {
    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(count.incrementAndGet());
        }
    }
}
