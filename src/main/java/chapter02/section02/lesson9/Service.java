package chapter02.section02.lesson9;

/**
 * @author: deng
 * @datetime: 2020/5/22 8:58 上午
 * @desc:
 */
public class Service {
    String synString = new String();

    public void a() {
        synchronized (synString) {
            try {
                System.out.println("a() begin");
                Thread.sleep(3000);
                System.out.println("a() end");
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }

    synchronized public void b() {
        try {
            System.out.println("b() begin");
            Thread.sleep(5000);
            System.out.println("b() end");
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

    }
}
