package chapter03.section01.lesson16;

/**
 * @author: deng
 * @datetime: 2020/5/28 11:08 下午
 * @desc: 一生产与多消费：操作栈 解决异常：if改while ，解决假死：notify改notifyAll
 */
public class Run1 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C c1 = new C(myStack);
        C c2 = new C(myStack);
        C c3 = new C(myStack);
        C c4 = new C(myStack);
        C c5 = new C(myStack);
        C c6 = new C(myStack);
        ThreadPush threadPush = new ThreadPush(p);
        ThreadPop threadPop1 = new ThreadPop(c1);
        ThreadPop threadPop2 = new ThreadPop(c2);
        ThreadPop threadPop3 = new ThreadPop(c3);
        ThreadPop threadPop4 = new ThreadPop(c4);
        ThreadPop threadPop5 = new ThreadPop(c5);
        ThreadPop threadPop6 = new ThreadPop(c6);
        threadPush.start();
        threadPop1.start();
        threadPop2.start();
        threadPop3.start();
        threadPop4.start();
        threadPop5.start();
        threadPop6.start();

    }
}
