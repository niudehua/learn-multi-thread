package chapter02.section01.lesson1;

/**
 * @author: deng
 * @datetime: 2020/5/19 5:20 下午
 * @desc:
 */
public class HasSelfPrivateNum {
    public void addI(String username) {
        try {
            int num = 0;
            if ("a".equals(username)) {
                num = 100;
                System.out.println("a set over");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("other set over");
            }
            System.out.println(username + "-num:" + num);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

}
