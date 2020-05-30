package chapter03.section01.lesson15;

/**
 * @author: deng
 * @datetime: 2020/5/28 11:09 下午
 * @desc:
 */
public class P {
    private MyStack myStack;

    public P(MyStack myStack) {
        this.myStack = myStack;
    }

    public void pushService() {
        myStack.push();
    }
}
