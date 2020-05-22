package chapter02.section02.lesson4;

/**
 * @author: deng
 * @datetime: 2020/5/21 9:32 下午
 * @desc:
 */
public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        ThreadA threadA = new ThreadA(task);
        threadA.start();
        ThreadB threadB = new ThreadB(task);
        threadB.start();
    }
}
