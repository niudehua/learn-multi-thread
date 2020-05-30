package chapter03.section03.lesson4;

/**
 * @author: deng
 * @datetime: 2020/5/30 2:21 下午
 * @desc: 解决get()返回null问题
 */
public class Run {
    public static ThreadLocalExt threadLocalExt = new ThreadLocalExt();

    public static void main(String[] args) {
        if (threadLocalExt.get() == null) {
            System.out.println("从未放过值");
            threadLocalExt.set("我的值");
        }
        System.out.println(threadLocalExt.get());
        System.out.println(threadLocalExt.get());
    }
}
