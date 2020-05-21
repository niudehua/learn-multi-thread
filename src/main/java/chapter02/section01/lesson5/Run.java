package chapter02.section01.lesson5;


/**
 * @author: deng
 * @datetime: 2020/5/20 4:48 下午
 * @desc: A线程现持有Object的Lock锁，B线程可以异步调用非synchronized类型的方法。A线程现持有Object的Lock锁，如果这时候B线程调用Object中的synchronized方法则需要等待，也就是同步。
 */
public class Run {
    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        ThreadA threadA = new ThreadA(myObject);
        threadA.setName("A");
        ThreadB threadB = new ThreadB(myObject);
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
