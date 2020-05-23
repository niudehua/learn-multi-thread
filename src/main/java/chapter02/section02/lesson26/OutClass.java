package chapter02.section02.lesson26;

/**
 * @author: deng
 * @datetime: 2020/5/24 1:20 上午
 * @desc:
 */
public class OutClass {
    static class Inner {
        public void methodA() {
            synchronized ("其它的锁") {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "---methodA i = " + (i + 1));
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException exception) {
                        exception.printStackTrace();
                    }
                }
            }
        }
    }

    synchronized public void methodB() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "---methodB i = " + (i + 1));
            try {
                Thread.sleep(100);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }

    }
}
