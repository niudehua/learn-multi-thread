package chapter02.section02.lesson29;

/**
 * @author: deng
 * @datetime: 2020/5/24 10:48 上午
 * @desc:
 */
public class Service {
    public void serviceMethodA(UserInfo userInfo) {
        synchronized (userInfo) {
            System.out.println(Thread.currentThread().getName());
            userInfo.setUsername("abcabc");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
            System.out.println("serviceMethodA end time = " + System.currentTimeMillis());
        }

    }
}
