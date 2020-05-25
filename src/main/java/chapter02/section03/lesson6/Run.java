package chapter02.section03.lesson6;

/**
 * @author: deng
 * @datetime: 2020/5/24 11:10 下午
 * @desc: addAndGet()方法是原子的，但方法和方法之间的调用不是原子的
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThread[] myThreads = new MyThread[5];
        for (int i = 0; i < myThreads.length; i++) {
            myThreads[i] = new MyThread(myService);
        }

        for (int i = 0; i < myThreads.length; i++) {
            myThreads[i].start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println(MyService.aiRef.get());
    }
}
