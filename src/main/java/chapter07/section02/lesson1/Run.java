package chapter07.section02.lesson1;

/**
 * @author: deng
 * @datetime: 2020/6/3 9:16 上午
 * @desc: 线程对象关联线程组：1级关联
 */
public class Run {
    public static void main(String[] args) {
        ThreadA aRunnable = new ThreadA();
        ThreadB bRunnable = new ThreadB();

        ThreadGroup group = new ThreadGroup("NiuDeHua的线程组");

        Thread aThread = new Thread(group, aRunnable);
        Thread bThread = new Thread(group, bRunnable);
        aThread.start();
        bThread.start();

        System.out.println("活动的线程数为：" + group.activeCount());
        System.out.println("线程组的名称为：" + group.getName());

    }
}
