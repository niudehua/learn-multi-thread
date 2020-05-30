package chapter03.section01.lesson4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: deng
 * @datetime: 2020/5/25 3:05 下午
 * @desc:
 */
public class MyList {
    private static List list = new ArrayList();

    public static void add() {
        list.add("anyString");
    }

    public static int size() {
        return list.size();
    }
}
