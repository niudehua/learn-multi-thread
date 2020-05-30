package chapter03.section01.lesson13;

/**
 * @author: deng
 * @datetime: 2020/5/27 5:35 下午
 * @desc: 生产与消费模式：操作值
 */
public class Run {
    public static void main(String[] args) {
        String lock = "lock";
        P p = new P(lock);
        C c = new C(lock);
        ThreadA pThread = new ThreadA(p);
        ThreadB cThread = new ThreadB(c);
        pThread.start();
        cThread.start();

    }
}
