package chapter07.section02.lesson4;

/**
 * @author: deng
 * @datetime: 2020/6/3 3:30 下午
 * @desc: 获取根线程组
 */
public class Run {
    public static void main(String[] args) {
        try {
            System.out.println("线程：" + Thread.currentThread().getName() + " 所在的线程组名为：" + Thread.currentThread().getThreadGroup().getName());
            System.out.println("main线程所在的线程组的父线程组的名称是：" + Thread.currentThread().getThreadGroup().getParent().getName());
            Thread.sleep(10000);
            System.out.println("main线程所在的线程组的父线程组的父线程组的名称是：" + Thread.currentThread().getThreadGroup().getParent().getParent().getName());
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
