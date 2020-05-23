package chapter02.section02.lesson12;

/**
 * @author: deng
 * @datetime: 2020/5/23 9:08 下午
 * @desc: 使用不同对象做对象监视器，所以是异步的
 */
public class Run2 {
    public static void main(String[] args) {
        MyObject myObject1 = new MyObject();
        MyObject myObject2 = new MyObject();
        Service service = new Service();
        ThreadA threadA = new ThreadA(service, myObject1);
        ThreadB threadB = new ThreadB(service, myObject2);
        threadA.setName("a");
        threadB.setName("b");
        threadA.start();
        threadB.start();
    }
}
