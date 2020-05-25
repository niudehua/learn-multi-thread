package chapter02.section03.lesson2;

/**
 * @author: deng
 * @datetime: 2020/5/24 11:03 上午
 * @desc: main线程一直在处理while()循环，导致程序无法执行后面的代码
 */
public class Run {
    public static void main(String[] args) {
        PrintString printString = new PrintString();
        Thread thread = new Thread(printString, "printString");
        thread.start();
        System.out.println("我要停止打印！stopThread = " + Thread.currentThread().getName());
        printString.setContinuePrint(false);
    }
}
