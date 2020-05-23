package chapter02.section02.lesson14;

/**
 * @author: deng
 * @datetime: 2020/5/23 9:23 下午
 * @desc: 当其它线程执行X对象中synchronized(this)代码块时呈同步效果
 */
public class Run1 {
    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        Service service = new Service();
        ThreadA threadA = new ThreadA(service, myObject);
        threadA.setName("a");
        ThreadB threadB = new ThreadB(myObject);
        threadB.setName("b");
        threadA.start();
        threadB.start();
    }
}
