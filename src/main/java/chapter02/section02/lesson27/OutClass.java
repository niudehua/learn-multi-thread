package chapter02.section02.lesson27;

/**
 * @author: deng
 * @datetime: 2020/5/24 1:33 上午
 * @desc:
 */
public class OutClass {
    static class Inner1 {
        public void method1(Inner2 inner2) {
            synchronized (inner2) {
                System.out.println(Thread.currentThread().getName() + "进入Inner1的method1()方法");
                for (int i = 0; i < 10; i++) {
                    System.out.println("i = " + (i + 1));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException exception) {
                        exception.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + "离开Inner1的method1()方法");
            }
        }

        synchronized public void method2() {
            System.out.println(Thread.currentThread().getName() + "进入Inner1的method2()方法");
            for (int j = 0; j < 10; j++) {
                System.out.println("j = " + (j + 1));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "离开Inner1的method2()方法");
        }

    }

    static class Inner2 {
        synchronized public void method() {
            System.out.println(Thread.currentThread().getName() + "进入Inner2的method()方法");
            for (int k = 0; k < 10; k++) {
                System.out.println("k = " + (k + 1));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "离开Inner2的method()方法");

        }
    }

}
