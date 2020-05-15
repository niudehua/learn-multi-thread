package chapter01.section02.lesson6;

/**
 * @author: deng
 * @datetime: 2020/5/15 2:31 下午
 * @desc:
 */
public class Run {
    public static void main(String[] args) {
        ALogin aLogin = new ALogin();
        aLogin.start();
        BLogin bLogin = new BLogin();
        bLogin.start();
    }
}
