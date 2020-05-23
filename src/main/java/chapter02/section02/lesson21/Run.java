package chapter02.section02.lesson21;

/**
 * @author: deng
 * @datetime: 2020/5/23 11:39 下午
 * @desc: 同步synchronized()方法无限等待问题
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        ThreadB threadB = new ThreadB(service);

        threadA.start();
        threadB.start();
    }
}
