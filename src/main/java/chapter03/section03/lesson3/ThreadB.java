package chapter03.section03.lesson3;

import java.util.Date;

/**
 * @author: deng
 * @datetime: 2020/5/30 2:01 下午
 * @desc:
 */
public class ThreadB extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
                if (Tools.threadLocal.get() == null) {
                    Tools.threadLocal.set(new Date());
                }
                System.out.println("A" + Tools.threadLocal.get().getTime());
                Thread.sleep(100);
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
