package chapter03.section01.lesson1;

/**
 * @author: deng
 * @datetime: 2020/5/25 10:28 上午
 * @desc:
 */
public class Run {
    public static void main(String[] args) {
        MyList service = new MyList();

        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();


        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();

    }

}
