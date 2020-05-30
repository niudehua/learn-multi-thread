package chapter03.section04.lesson2;

/**
 * @author: deng
 * @datetime: 2020/5/30 2:50 下午
 * @desc:
 */
public class ThreadA extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("在ThreadA线程中取值=" + Tools.inheritableThreadLocalExt.get());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}