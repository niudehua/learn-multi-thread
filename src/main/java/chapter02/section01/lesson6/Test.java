package chapter02.section01.lesson6;

/**
 * @author: deng
 * @datetime: 2020/5/21 10:00 上午
 * @desc: 数据脏读
 */
public class Test {
    public static void main(String[] args) {
        try {
            PublicVar publicVar = new PublicVar();
            ThreadA threadA = new ThreadA(publicVar);
            threadA.start();
            Thread.sleep(500);
            publicVar.getValue();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

    }
}
