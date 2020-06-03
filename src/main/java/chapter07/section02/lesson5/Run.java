package chapter07.section02.lesson5;

/**
 * @author: deng
 * @datetime: 2020/6/3 3:53 下午
 * @desc: 线程组里加线程组
 */
public class Run {
    public static void main(String[] args) {
        try {
            System.out.println("线程组名称：" + Thread.currentThread().getThreadGroup().getName());
            System.out.println("线程组中活动的线程数量：" + Thread.currentThread().getThreadGroup().activeCount());
            System.out.println("线程组中线程组的数量-加之前：" + Thread.currentThread().getThreadGroup().activeGroupCount());
            ThreadGroup newGroup = new ThreadGroup(Thread.currentThread().getThreadGroup(), "newGroup");
            System.out.println("线程组中线程组的数量-加之之后：" + Thread.currentThread().getThreadGroup().activeGroupCount());
            System.out.println("父线程组名称：" + Thread.currentThread().getThreadGroup().getParent().getName());
            Thread.sleep(10000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
