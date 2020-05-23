package chapter02.section02.lesson9;

/**
 * @author: deng
 * @datetime: 2020/5/22 9:01 上午
 * @desc: 不同的对象监视器实现异步效果
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        ThreadB threadB = new ThreadB(service);
        threadA.setName("a");
        threadB.setName("b");
        threadA.start();
        threadB.start();
    }
}
