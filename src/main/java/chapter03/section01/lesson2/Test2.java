package chapter03.section01.lesson2;


/**
 * @author: deng
 * @datetime: 2020/5/25 2:22 下午
 * @desc: wait()方法
 */
public class Test2 {
    public static void main(String[] args) {
        try {
            String lock = new String();
            System.out.println("sync 前 ....");
            synchronized (lock) {
                System.out.println("sycn 开始 ...");
                lock.wait();
                System.out.println("wait 下 ...");
            }
            System.out.println("sync 后 ....");
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

    }
}
