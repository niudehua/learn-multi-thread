package chapter07.section02.lesson3;

/**
 * @author: deng
 * @datetime: 2020/6/3 3:18 下午
 * @desc: 线程组自动归属特性:自动归属就是自动归到当前线程组中
 */
public class Run {
    public static void main(String[] args) {
        try {
            System.out.println("A处线程：" + Thread.currentThread().getName() + " 所属的线程组名为：" + Thread.currentThread().getThreadGroup().getName() + " " + " 中有线程组数量：" + Thread.currentThread().getThreadGroup().activeGroupCount());
            ThreadGroup group = new ThreadGroup("新的组");
            System.out.println("B处线程：" + Thread.currentThread().getName() + " 所属的线程组名为：" + Thread.currentThread().getThreadGroup().getName() + " " + " 中有线程组数量：" + Thread.currentThread().getThreadGroup().activeGroupCount());
            ThreadGroup[] threadGroup = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
            Thread.currentThread().getThreadGroup().enumerate(threadGroup);
            for (int i = 0; i < threadGroup.length; i++) {
                Thread.sleep(10000);
                System.out.println("第一个线程组名称为：" + threadGroup[i].getName());
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
