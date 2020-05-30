package chapter03.section02.lesson4;

/**
 * @author: deng
 * @datetime: 2020/5/29 11:14 下午
 * @desc:
 */
public class Test {

    public static void main(String[] args) {
        try {
            MyThread threadTest = new MyThread();
            threadTest.start();

            threadTest.join(2000);///只等2秒
//			Thread.sleep(2000);

            System.out.println("  end timer=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}