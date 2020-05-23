package chapter02.section02.lesson10;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: deng
 * @datetime: 2020/5/22 9:42 上午
 * @desc:
 */
public class MyList {
    private List list = new ArrayList();

    synchronized public void add(String username) {
        System.out.println("ThreadName:" + Thread.currentThread().getName() + "执行add()");
        list.add(username);
        System.out.println("ThreadName:" + Thread.currentThread().getName() + "退出add()");
    }

    synchronized public int getSize() {
        System.out.println("ThreadName:" + Thread.currentThread().getName() + "执行getSize()");
        int size = list.size();
        System.out.println("ThreadName:" + Thread.currentThread().getName() + "退出getSize()");
        return size;
    }
}
