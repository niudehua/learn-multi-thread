package chapter03.section01.lesson16;

/**
 * @author: deng
 * @datetime: 2020/5/28 11:09 下午
 * @desc:
 */
public class C {
    private MyStack myStack;

    public C(MyStack myStack) {
        this.myStack = myStack;
    }

    public void popService() {
        System.out.println("pop = " + myStack.pop());
    }
}
