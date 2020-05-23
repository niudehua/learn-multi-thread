package chapter02.section02.lesson20;

/**
 * @author: deng
 * @datetime: 2020/5/23 11:36 下午
 * @desc:
 */
public class Service {

    public static void print(Object object) {
        synchronized (object) {
            try {
                while (true) {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }
}
