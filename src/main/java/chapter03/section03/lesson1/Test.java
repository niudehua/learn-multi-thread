package chapter03.section03.lesson1;

/**
 * @author: deng
 * @datetime: 2020/5/30 10:35 上午
 * @desc:
 */
public class Test {
    public static ThreadLocal threadLocal = new ThreadLocal();

    public static void main(String[] args) {
        if (threadLocal.get() == null) {
            System.out.println("threadLocal 未设置过值");
            threadLocal.set("我的值");
        }
        System.out.println(threadLocal.get());
        System.out.println(threadLocal.get());
    }
}
