package chapter03.section03.lesson5;

import java.util.Date;

/**
 * @author: deng
 * @datetime: 2020/5/30 2:19 下午
 * @desc:
 */
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date();
    }

}
