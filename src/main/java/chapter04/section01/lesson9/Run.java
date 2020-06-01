package chapter04.section01.lesson9;

/**
 * @author: deng
 * @datetime: 2020/5/30 10:40 下午
 * @desc: 多个线程使用signal 出现假死，修改为signalAll方法解决
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        Thread[] setThread = new Thread[10];
        Thread[] getThread = new Thread[10];

        for (int i = 0; i < 10; i++) {
            setThread[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    myService.set();
                }
            });
            setThread[i].setName("set-" + (i + 1));
            getThread[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    myService.get();
                }
            });
            getThread[i].setName("get-" + (i + 1));
            setThread[i].start();
            getThread[i].start();
        }
    }
}
