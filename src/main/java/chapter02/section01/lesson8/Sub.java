package chapter02.section01.lesson8;

/**
 * @author: deng
 * @datetime: 2020/5/21 11:03 上午
 * @desc:
 */
public class Sub extends Main {
    @Override
    synchronized public void operateIMainMethod() {
        try {
            while (i > 0) {
                i--;
                System.out.println("sub print i = " + i);
                Thread.sleep(100);
                this.operateIMainMethod();
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
