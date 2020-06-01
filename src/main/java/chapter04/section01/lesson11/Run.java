package chapter04.section01.lesson11;

/**
 * @author: deng
 * @datetime: 2020/5/31 11:38 下午
 * @desc: getHoldCount()方法的作用是查询当前线程保持此锁定的次数，也就是调用lock()方法的次数
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        service.serviceMethod1();

    }
}
