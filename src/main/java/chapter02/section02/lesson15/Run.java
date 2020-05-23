package chapter02.section02.lesson15;

/**
 * @author: deng
 * @datetime: 2020/5/23 10:04 下午
 * @desc: synchronized 修饰static方法 是给Class加锁
 */
public class Run {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        threadA.setName("a");
        threadB.setName("b");
        threadA.start();
        threadB.start();
    }
}
