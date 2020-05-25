package chapter02.section02.lesson28;

/**
 * @author: deng
 * @datetime: 2020/5/24 1:56 上午
 * @desc: 锁对象的改变
 */
public class Run2 {
    public static void main(String[] args) {
        final Service service = new Service();
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                service.testMethod();
            }
        }, "a");
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                service.testMethod();
            }
        }, "b");

        threadA.start();
        // 去掉sleep 就会threadA就会与threadB争锁 导致同步执行
        threadB.start();
    }

}
