package chapter03.section04.lesson1;

import java.time.Instant;

/**
 * @author: deng
 * @datetime: 2020/5/30 2:40 下午
 * @desc:
 */
public class InheritableThreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return Instant.now().toEpochMilli();
    }


}