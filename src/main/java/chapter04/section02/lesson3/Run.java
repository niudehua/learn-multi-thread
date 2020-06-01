package chapter04.section02.lesson3;

/**
 * @author: deng
 * @datetime: 2020/6/1 4:15 下午
 * @desc: ReentrantReadWriteLock:读写互斥
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
