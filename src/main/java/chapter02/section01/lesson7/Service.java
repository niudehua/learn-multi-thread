package chapter02.section01.lesson7;

/**
 * @author: deng
 * @datetime: 2020/5/21 10:44 上午
 * @desc:
 */
public class Service {
    synchronized public void service1() {
        System.out.println("service1");
        service2();

    }

    synchronized public void service2() {
        System.out.println("service2");
        service3();
    }

    synchronized public void service3() {
        System.out.println("service");
    }

}
