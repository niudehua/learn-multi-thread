package chapter02.section02.lesson14;

/**
 * @author: deng
 * @datetime: 2020/5/23 9:23 下午
 * @desc: 使用不同对象，呈异步效果
 */
public class Run2 {
    public static void main(String[] args) {
        MyObject myObject1 = new MyObject();
        MyObject myObject2 = new MyObject();
        Service service = new Service();
        ThreadA threadA = new ThreadA(service, myObject1);
        threadA.setName("a");
        ThreadB threadB = new ThreadB(myObject2);
        threadB.setName("b");
        threadA.start();
        threadB.start();
    }
}
