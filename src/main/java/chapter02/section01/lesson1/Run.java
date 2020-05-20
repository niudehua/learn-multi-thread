package chapter02.section01.lesson1;

/**
 * @author: deng
 * @datetime: 2020/5/19 11:35 下午
 * @desc: "非线程安全"问题存在于"实例变量"中，如果是方法内部的私有变量，则不存在"非线程安全"问题，所得结果也是"线程安全"的
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum hasSelfPrivateNum = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(hasSelfPrivateNum);
        threadA.start();
        ThreadB threadB = new ThreadB(hasSelfPrivateNum);
        threadB.start();
    }
}
