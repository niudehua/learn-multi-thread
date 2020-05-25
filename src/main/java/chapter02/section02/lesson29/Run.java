package chapter02.section02.lesson29;

/**
 * @author: deng
 * @datetime: 2020/5/24 10:51 上午
 * @desc:
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        UserInfo userInfo = new UserInfo();
        ThreadA threadA = new ThreadA(service,userInfo);
        ThreadB threadB = new ThreadB(service,userInfo);
        threadA.setName("a");
        threadA.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        threadB.setName("b");
        threadB.start();
    }
}
