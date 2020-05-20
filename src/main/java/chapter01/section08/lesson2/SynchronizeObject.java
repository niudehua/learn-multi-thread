package chapter01.section08.lesson2;

/**
 * @author: deng
 * @datetime: 2020/5/17 10:08 下午
 * @desc:
 */
public class SynchronizeObject {
    synchronized public void printString() {
        System.out.println("printString() 开始");
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("a线程被暂停");
            Thread.currentThread().suspend();
        }
        System.out.println("printString() 结束");
    }
}
