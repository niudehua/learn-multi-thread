package chapter02.section02.lesson20;

/**
 * @author: deng
 * @datetime: 2020/5/23 11:39 下午
 * @desc: 使用Object作为synchronized()代码块的锁对象
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
