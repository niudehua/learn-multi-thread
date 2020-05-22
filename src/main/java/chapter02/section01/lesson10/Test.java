package chapter02.section01.lesson10;

/**
 * @author: deng
 * @datetime: 2020/5/21 2:20 下午
 * @desc: 同步不具备继承性
 */
public class Test {
    public static void main(String[] args) {
        Sub sub = new Sub();
        ThreadA threadA = new ThreadA(sub);
        threadA.setName("a");
        threadA.start();
        ThreadB threadB = new ThreadB(sub);
        threadB.setName("b");
        threadB.start();
    }
}
