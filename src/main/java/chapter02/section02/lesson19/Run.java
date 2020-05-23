package chapter02.section02.lesson19;

/**
 * @author: deng
 * @datetime: 2020/5/23 11:39 下午
 * @desc: 线程调用Service.print()方法时使用的String参数都是"string"，因为String类型常量池的特性，两个线程持有的是同一对象锁，导致线程B无法执行，因此大多数情况下，同步synchronized()代码块不实用String作为锁对象
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
