package chapter01.section02.lesson6;

/**
 * @author: deng
 * @datetime: 2020/5/15 2:30 下午
 * @desc:
 */
public class ALogin extends Thread {
    @Override
    public void run() {
        LoginService.doPost("a", "aaa");
    }
}
