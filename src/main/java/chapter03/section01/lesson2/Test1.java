package chapter03.section01.lesson2;


/**
 * @author: deng
 * @datetime: 2020/5/25 2:22 下午
 * @desc: Exception in thread "main" java.lang.IllegalMonitorStateException ,没有对象监视器
 */
public class Test1 {
    public static void main(String[] args) {
        try {
            String string = "";
            string.wait();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
