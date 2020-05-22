package chapter02.section01.lesson10;

/**
 * @author: deng
 * @datetime: 2020/5/21 2:15 下午
 * @desc:
 */
public class Sub extends Main {
    @Override
     public void testMethod() {
        try {
            System.out.println("sub-ThreadName:" + Thread.currentThread().getName() + "\tcurrentTime:" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("sub-sleep--ThreadName:" + Thread.currentThread().getName() + "\tcurrentTime:" + System.currentTimeMillis());
            super.testMethod();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
