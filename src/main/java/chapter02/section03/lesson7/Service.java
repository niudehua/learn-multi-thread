package chapter02.section03.lesson7;

/**
 * @author: deng
 * @datetime: 2020/5/24 11:27 下午
 * @desc:
 */
public class Service {
    private boolean isContinue = true;

    public void runMethod() {
        while (isContinue) {

        }
        System.out.println("停下来了");
    }

    public void stopMethod() {
        isContinue = false;
    }
}
