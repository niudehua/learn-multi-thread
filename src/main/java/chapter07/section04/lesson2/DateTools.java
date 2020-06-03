package chapter07.section04.lesson2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: deng
 * @datetime: 2020/6/3 11:25 下午
 * @desc:
 */
public class DateTools {
    public static Date parse(String formatPattern, String dateString)
            throws ParseException {
        return new SimpleDateFormat(formatPattern).parse(dateString);
    }

    public static String format(String formatPattern, Date date) {
        return new SimpleDateFormat(formatPattern).format(date).toString();
    }

}
