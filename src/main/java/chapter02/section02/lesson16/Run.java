package chapter02.section02.lesson16;

/**
 * @author: deng
 * @datetime: 2020/5/23 10:04 下午
 * @desc: synchronized 修饰static方法 是给Class加锁，修饰非static方法是给对象上锁
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        ThreadC threadC = new ThreadC(service);
        threadA.setName("a");
        threadB.setName("b");
        threadC.setName("c");
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
