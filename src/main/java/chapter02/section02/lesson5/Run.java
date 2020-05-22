package chapter02.section02.lesson5;

/**
 * @author: deng
 * @datetime: 2020/5/21 9:48 下午
 * @desc: 使用同步synchronized(this)代码块时，要注意当一个线程访问对象的一个synchronized(this)同步代码块时，其它线程对同一个object中所有其它的synchronized(this)同步代码块的访问将会是阻塞的，这说明synchronized使用的"对象监视器"是一个。
 */
public class Run {
    public static void main(String[] args) {
        ObjectService objectService = new ObjectService();
        ThreadA threadA = new ThreadA(objectService);
        ThreadB threadB = new ThreadB(objectService);
        threadA.start();
        threadB.start();
    }
}
