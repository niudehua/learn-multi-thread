package chapter02.section01.lesson9;

/**
 * @author: deng
 * @datetime: 2020/5/21 2:07 下午
 * @desc: 出现异常，锁自动释放
 */
public class Test {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            ThreadA threadA = new ThreadA(service);
            threadA.setName("a");
            threadA.start();
            Thread.sleep(1000);
            ThreadB threadB = new ThreadB(service);
            threadB.setName("b");
            threadB.start();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
