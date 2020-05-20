package chapter01.section010.lesson4;

/**
 * @author: deng
 * @datetime: 2020/5/19 4:11 下午
 * @desc: 设置不同优先级 看谁运行得快
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadA threadA = new ThreadA();
            threadA.setPriority(Thread.NORM_PRIORITY - 4);
            threadA.start();
            ThreadB threadB = new ThreadB();
            threadB.setPriority(Thread.NORM_PRIORITY + 4);
            threadB.start();
            Thread.sleep(2000);
            threadA.stop();
            threadB.stop();
            System.out.println("threadA.getCount()" + threadA.getCount());
            System.out.println("threadB.getCount()" + threadB.getCount());
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
