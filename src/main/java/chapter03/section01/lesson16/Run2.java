package chapter03.section01.lesson16;

/**
 * @author: deng
 * @datetime: 2020/5/28 11:08 下午
 * @desc: 多生产与一消费：操作栈
 */
public class Run2 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p1 = new P(myStack);
        P p2 = new P(myStack);
        P p3 = new P(myStack);
        P p4 = new P(myStack);
        P p5 = new P(myStack);
        P p6 = new P(myStack);
        C c = new C(myStack);
        ThreadPush threadPush1 = new ThreadPush(p1);
        ThreadPush threadPush2 = new ThreadPush(p2);
        ThreadPush threadPush3 = new ThreadPush(p3);
        ThreadPush threadPush4 = new ThreadPush(p4);
        ThreadPush threadPush5 = new ThreadPush(p5);
        ThreadPush threadPush6 = new ThreadPush(p6);
        ThreadPop threadPop1 = new ThreadPop(c);

        threadPush1.start();
        threadPush2.start();
        threadPush3.start();
        threadPush4.start();
        threadPush5.start();
        threadPush6.start();
        threadPop1.start();

    }
}
