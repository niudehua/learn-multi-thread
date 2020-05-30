package chapter03.section01.lesson4;

/**
 * @author: deng
 * @datetime: 2020/5/25 3:07 下午
 * @desc:
 */
public class ThreadB extends Thread {
    private Object lock;

    public ThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                for (int i = 0; i < 10; i++) {
                    MyList.add();
                    if (MyList.size() == 5) {
                        lock.notify();
                        System.out.println("已经发出通知 : " + System.currentTimeMillis());
                    }
                    System.out.println("添加了 " + (i + 1) + "个元素");
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
