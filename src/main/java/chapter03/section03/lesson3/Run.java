package chapter03.section03.lesson3;


/**
 * @author: deng
 * @datetime: 2020/5/30 2:05 下午
 * @desc: 验证线程变量的隔离性
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadA threadA = new ThreadA();
            ThreadB threadB = new ThreadB();
            threadA.start();
            Thread.sleep(1000);
            threadB.start();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
