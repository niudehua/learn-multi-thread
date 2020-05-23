package chapter02.section02.lesson12;

/**
 * @author: deng
 * @datetime: 2020/5/23 9:08 下午
 * @desc: 当多个线程同时执行synchronized(x){}同步代码块时呈同步效果。使用同一个对象做对象监视器，所以是同步的
 */
public class Run1 {
    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        Service service = new Service();
        ThreadA threadA = new ThreadA(service, myObject);
        ThreadB threadB = new ThreadB(service, myObject);
        threadA.setName("a");
        threadB.setName("b");
        threadA.start();
        threadB.start();
    }
}
