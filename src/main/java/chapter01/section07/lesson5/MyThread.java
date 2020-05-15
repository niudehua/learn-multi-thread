package chapter01.section07.lesson5;

/**
 * @author: deng
 * @datetime: 2020/5/15 5:57 下午
 * @desc: 能停止的线程-异常法
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5000; i++) {
                if (Thread.interrupted()) {
                    System.out.println("已经是中断状态了，我要抛出中断异常然后退出了！！！");
                    throw new InterruptedException();
                }
                System.out.println("i=" + (i + 1));
            }
            System.out.println("我在for下面");
        } catch (InterruptedException exception) {
            System.out.println("myThread catch");
            exception.printStackTrace();
        }
    }
}
