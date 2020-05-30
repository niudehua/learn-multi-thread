package chapter03.section03.lesson2;

/**
 * @author: deng
 * @datetime: 2020/5/30 11:25 上午
 * @desc: 验证线程变量的隔离性
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadA threadA = new ThreadA();
            ThreadB threadB = new ThreadB();
            threadA.start();
            threadB.start();

            for (int i = 0; i < 100; i++) {
                Tools.threadLocal.set("mainThread" + (i + 1));
                System.out.println("mainThread get Value" + Tools.threadLocal.get());
                Thread.sleep(1000);

            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
