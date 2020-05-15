package chapter01.section02.lesson2;

/**
 * @author: deng
 * @datetime: 2020/5/15 11:12 上午
 * @desc: 测试线程随机性
 */
public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("myThread");
        myThread.start();
        for (int i = 0; i < 10; i++) {
            int time = (int) (Math.random() * 1000);
            try {
                Thread.sleep(time);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
            System.out.println("main=" + Thread.currentThread().getName());
            //main=main
            //run=myThread
            //main=main
            //main=main
            //run=myThread
            //main=main
            //main=main
            //run=myThread
            //run=myThread
            //main=main
            //run=myThread
            //main=main
            //run=myThread
            //main=main
            //run=myThread
            //main=main
            //main=main
            //run=myThread
            //run=myThread
            //run=myThread

        }
    }
}
