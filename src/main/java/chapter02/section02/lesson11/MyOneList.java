package chapter02.section02.lesson11;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: deng
 * @datetime: 2020/5/22 9:52 上午
 * @desc:
 */
public class MyOneList {
    private final List list = new ArrayList();

    synchronized public void add(String username) {
        list.add(username);
    }

    synchronized public int getSize() {
        return list.size();
    }
}
