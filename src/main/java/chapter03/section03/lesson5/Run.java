package chapter03.section03.lesson5;

/**
 * @author: deng
 * @datetime: 2020/5/30 2:29 下午
 * @desc: 再次验证线程变量隔离性
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadA threadA = new ThreadA();
            ThreadB threadB = new ThreadB();
            for (int i = 0; i < 20; i++) {
                System.out.println("在main线程中取值 ： " + Tools.threadLocalExt.get());
                Thread.sleep(1000);
            }
            threadA.start();
            Thread.sleep(1000);
            threadB.start();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

    }
}
