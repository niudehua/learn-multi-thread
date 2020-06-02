package chapter06.section04;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author: deng
 * @datetime: 2020/6/2 4:12 下午
 * @desc: 序列化与反序列化的单例模式实现
 */
public class MyObject implements Serializable {

    private static final long serialVersionUID = 888L;

    // 内部类方式
    private static class MyObjectHandler {
        private static final MyObject myObject = new MyObject();
    }

    private MyObject() {
    }

    public static MyObject getInstance() {
        return MyObjectHandler.myObject;
    }

    protected Object readResolve() throws ObjectStreamException {
        System.out.println("调用了readResolve方法！");
        return MyObjectHandler.myObject;
    }

}