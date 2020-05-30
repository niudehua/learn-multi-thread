package chapter03.section01.lesson16;

/**
 * @author: deng
 * @datetime: 2020/5/28 11:08 下午
 * @desc: 多生产与多消费：操作栈
 */
public class Run3 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p1 = new P(myStack);
        P p2 = new P(myStack);
        P p3 = new P(myStack);
        P p4 = new P(myStack);
        P p5 = new P(myStack);
        P p6 = new P(myStack);
        ThreadPush threadPush1 = new ThreadPush(p1);
        ThreadPush threadPush2 = new ThreadPush(p2);
        ThreadPush threadPush3 = new ThreadPush(p3);
        ThreadPush threadPush4 = new ThreadPush(p4);
        ThreadPush threadPush5 = new ThreadPush(p5);
        ThreadPush threadPush6 = new ThreadPush(p6);

        C c1 = new C(myStack);
        C c2 = new C(myStack);
        C c3 = new C(myStack);
        C c4 = new C(myStack);
        C c5 = new C(myStack);
        C c6 = new C(myStack);
        ThreadPop threadPop1 = new ThreadPop(c1);
        ThreadPop threadPop2 = new ThreadPop(c2);
        ThreadPop threadPop3 = new ThreadPop(c3);
        ThreadPop threadPop4 = new ThreadPop(c4);
        ThreadPop threadPop5 = new ThreadPop(c5);
        ThreadPop threadPop6 = new ThreadPop(c6);

        threadPush1.start();
        threadPush2.start();
        threadPush3.start();
        threadPush4.start();
        threadPush5.start();
        threadPush6.start();
        threadPop1.start();
        threadPop2.start();
        threadPop3.start();
        threadPop4.start();
        threadPop5.start();
        threadPop6.start();

    }
}
