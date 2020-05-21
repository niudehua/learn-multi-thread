package chapter02.section01.lesson4;

/**
 * @author: deng
 * @datetime: 2020/5/20 4:45 下午
 * @desc: 调用用synchronized关键字声明的方法一定是排队运行的，牢记"共享"两字，只有共享资源的方法需要同步化
 */
public class MyObject {
    synchronized public void methodA() {
        try {
            System.out.println("methodA() begin - threadName:" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("methodA() end" + Thread.currentThread().getName());
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
