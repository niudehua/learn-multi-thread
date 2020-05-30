package chapter03.section01.lesson15;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: deng
 * @datetime: 2020/5/28 11:00 下午
 * @desc: 栈 ：后进先出
 */
public class MyStack {
    private List list = new ArrayList();

    /**
     * 压栈
     */
    synchronized public void push() {
        try {
            if (list.size() == 1) {
                this.wait();
            }
            list.add("anyString = " + Math.random());
            this.notify();
            System.out.println("push  = " + list.size());
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    /**
     * 弹栈
     */
    synchronized public String pop() {
        String value = "";
        try {
            if (list.size() == 0) {
                System.out.println("pop 操作中的 ：" + Thread.currentThread().getName() + "线程是wait状态");
                this.wait();
            }
            value = (String) list.get(0);
            list.remove(0);
            this.notify();
            System.out.println("pop = " + list.size());
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        return value;
    }


}
