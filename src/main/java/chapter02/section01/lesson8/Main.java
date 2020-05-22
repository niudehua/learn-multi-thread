package chapter02.section01.lesson8;

/**
 * @author: deng
 * @datetime: 2020/5/21 10:59 上午
 * @desc:
 */
public class Main {
    int i = 10;

    synchronized public void operateIMainMethod() {
        try {
            i--;
            System.out.println("main print i = " + i);
            Thread.sleep(100);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

    }
}
