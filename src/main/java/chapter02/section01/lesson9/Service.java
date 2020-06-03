package chapter02.section01.lesson9;

/**
 * @author: deng
 * @datetime: 2020/5/21 1:57 下午
 * @desc:
 */
public class Service {
    synchronized public void testMethod() {
        if ("a".equals(Thread.currentThread().getName())) {
            System.out.println("ThreadName:" + Thread.currentThread().getName() + "\t run beginTime:" + System.currentTimeMillis());
            int i = 1;
            while (i == 1) {
                if (("" + Math.random()).substring(0, 8).equals("0.123456")) {
                    System.out.println("ThreadName:" + Thread.currentThread().getName() + "\t run exceptionTime:" + System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }
        } else {
            System.out.println("ThreadB runTime:" + System.currentTimeMillis());
        }
    }
}
