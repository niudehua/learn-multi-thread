package chapter02.section02.lesson18;

/**
 * @author: deng
 * @datetime: 2020/5/23 10:04 下午
 * @desc: synchronized 修饰static方法 与synchronized(*.class)代码块
 */
public class Run {
    public static void main(String[] args) {
        Service service1 = new Service();
        Service service2 = new Service();
        ThreadA threadA = new ThreadA(service1);
        ThreadB threadB = new ThreadB(service2);
        threadA.setName("a");
        threadB.setName("b");
        threadA.start();
        threadB.start();
    }
}
