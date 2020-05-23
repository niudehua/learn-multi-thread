package chapter02.section02.lesson10;

/**
 * @author: deng
 * @datetime: 2020/5/22 9:46 上午
 * @desc:
 */
public class Run {
    public static void main(String[] args) {
        MyList myList = new MyList();
        ThreadA threadA = new ThreadA(myList);
        ThreadB threadB = new ThreadB(myList);
        threadA.setName("a");
        threadB.setName("b");
        threadA.start();
        threadB.start();
    }
}
