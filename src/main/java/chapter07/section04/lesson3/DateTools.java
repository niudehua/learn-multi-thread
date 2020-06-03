package chapter07.section04.lesson3;

import java.text.SimpleDateFormat;

/**
 * @author: deng
 * @datetime: 2020/6/3 11:35 下午
 * @desc: 解决异常方法2 ：通过ThreadLocal 为每个线程设置独有的线程内变量
 */
public class DateTools {
    private static ThreadLocal<SimpleDateFormat> tl = new ThreadLocal<SimpleDateFormat>();

    public static SimpleDateFormat getSimpleDateFormat(String datePattern) {
        SimpleDateFormat sdf = null;
        sdf = tl.get();
        if (sdf == null) {
            sdf = new SimpleDateFormat(datePattern);
            tl.set(sdf);
        }
        return sdf;
    }
}
