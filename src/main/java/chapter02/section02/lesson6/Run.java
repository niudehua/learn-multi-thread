package chapter02.section02.lesson6;

/**
 * @author: deng
 * @datetime: 2020/5/21 10:00 下午
 * @desc: 验证synchronized(this)是锁定当前对象的
 */
public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        ThreadA threadA = new ThreadA(task);
        threadA.setName("a");
        threadA.start();
        ThreadB threadB = new ThreadB(task);
        threadB.setName("b");
        threadB.start();
    }
}
