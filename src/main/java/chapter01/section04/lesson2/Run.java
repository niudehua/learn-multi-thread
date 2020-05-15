package chapter01.section04.lesson2;

/**
 * @author: deng
 * @datetime: 2020/5/15 3:05 下午
 * @desc:
 */
public class Run {
    public static void main(String[] args) {
        CountOperate countOperate = new CountOperate();
        Thread thread = new Thread(countOperate, "A");
        System.out.println("调用start方法前:" + thread.isAlive());
        thread.start();
        System.out.println("调用start方法后:" + thread.isAlive());

    }
}
