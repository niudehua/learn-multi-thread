package chapter02.section03.lesson6;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author: deng
 * @datetime: 2020/5/24 10:57 下午
 * @desc:
 */
public class MyService {
    public static AtomicLong aiRef = new AtomicLong();

    synchronized public void addNum() {
        System.out.println(Thread.currentThread().getName() + "加了100后的值是：" + aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }


}
