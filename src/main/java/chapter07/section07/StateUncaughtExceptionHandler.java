package chapter07.section07;

import java.lang.Thread.UncaughtExceptionHandler;

/**
 * @author: deng
 * @datetime: 2020/6/4 12:07 上午
 * @desc:
 */
public class StateUncaughtExceptionHandler implements UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("静态的异常处理");
        e.printStackTrace();
    }

}