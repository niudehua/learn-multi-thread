package chapter02.section02.lesson8;

/**
 * @author: deng
 * @datetime: 2020/5/21 10:34 下午
 * @desc:
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("a");
        ThreadB threadB = new ThreadB(service);
        threadB.setName("b");
        threadA.start();
        threadB.start();
    }
}
