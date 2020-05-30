package chapter03.section01.lesson19;

/**
 * @author: deng
 * @datetime: 2020/5/29 5:18 下午
 * @desc:
 */
public class Run {
    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for (int i = 0; i < 20; i++) {
            ThreadA threadA = new ThreadA(dbTools);
            threadA.start();
            ThreadB threadB = new ThreadB(dbTools);
            threadB.start();
        }
    }
}
