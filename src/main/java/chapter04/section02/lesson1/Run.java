package chapter04.section02.lesson1;

/**
 * @author: deng
 * @datetime: 2020/6/1 3:53 下午
 * @desc: ReentrantReadWriteLock:读读共享
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
        b.start();
    }
}
