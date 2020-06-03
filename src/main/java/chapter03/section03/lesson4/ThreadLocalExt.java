package chapter03.section03.lesson4;

/**
 * @author: deng
 * @datetime: 2020/5/30 2:19 下午
 * @desc:
 */
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return "我是默认值 第一次get不再是null";
    }
}
