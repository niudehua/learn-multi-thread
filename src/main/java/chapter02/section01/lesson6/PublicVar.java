package chapter02.section01.lesson6;

/**
 * @author: deng
 * @datetime: 2020/5/21 9:54 上午
 * @desc:
 */
public class PublicVar {
    public String username = "A";
    public String password = "aaaa";

    synchronized public void setValue(String username, String password) {
        try {
            System.out.println("setValue() begin" + Thread.currentThread().getName() + "\tSystem.currentTimeMillis()" + System.currentTimeMillis());
            this.username = username;
            Thread.sleep(1000);
            this.password = password;
            System.out.println("setValue() end" + Thread.currentThread().getName() + "\tSystem.currentTimeMillis()" + System.currentTimeMillis());

        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    public void getValue() {
        System.out.println("getValue()--Thread.currentThread().getName():" + Thread.currentThread().getName() + "\tusername:" + username + "\tpassword:" + password);
        System.out.println("getValue()--System.currentTimeMillis()" + System.currentTimeMillis());
    }
}
