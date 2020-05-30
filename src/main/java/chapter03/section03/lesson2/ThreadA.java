package chapter03.section03.lesson2;

import javax.tools.Tool;

/**
 * @author: deng
 * @datetime: 2020/5/30 11:22 上午
 * @desc:
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                Tools.threadLocal.set("ThreadA" + (i + 1));
                System.out.println("ThreadA get Value = "+ Tools.threadLocal.get());
                Thread.sleep(2000);
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
