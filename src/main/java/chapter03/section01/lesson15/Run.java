package chapter03.section01.lesson15;

/**
 * @author: deng
 * @datetime: 2020/5/28 11:08 下午
 * @desc: 一生产与一消费：操作栈
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C c = new C(myStack);
        ThreadPush threadPush = new ThreadPush(p);
        ThreadPop threadPop = new ThreadPop(c);
        threadPush.start();
        threadPop.start();

    }
}
