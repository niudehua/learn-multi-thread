package chapter07.section07;

import java.lang.Thread.UncaughtExceptionHandler;

/**
 * @author: deng
 * @datetime: 2020/6/4 12:06 上午
 * @desc:
 */
public class ObjectUncaughtExceptionHandler implements UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("对象的异常处理");
        e.printStackTrace();
    }

}