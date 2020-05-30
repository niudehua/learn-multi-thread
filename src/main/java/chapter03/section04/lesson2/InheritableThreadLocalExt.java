package chapter03.section04.lesson2;

import java.time.Instant;

/**
 * @author: deng
 * @datetime: 2020/5/30 3:02 下午
 * @desc:
 */
public class InheritableThreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return Instant.now().toEpochMilli();
    }

    @Override
    protected Object childValue(Object parentValue) {
        return parentValue + "我在子线程加的";
    }
}
