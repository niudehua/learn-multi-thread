package chapter02.section01.lesson4;

/**
 * @author: deng
 * @datetime: 2020/5/20 4:48 下午
 * @desc:
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
