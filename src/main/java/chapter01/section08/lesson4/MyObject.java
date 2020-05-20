package chapter01.section08.lesson4;

/**
 * @author: deng
 * @datetime: 2020/5/18 9:36 上午
 * @desc:
 */
public class MyObject {
    private String username = "11";
    private String password = "1111";

    public void setValue(String username, String password) {
        this.username = username;
        if ("aa".equals(Thread.currentThread().getName())) {
            System.out.println("线程a即将暂停");
            Thread.currentThread().suspend();
        }
        this.password = password;
    }

    public void printString() {
        System.out.println("username:" + username + "\tpassword:" + password);
    }

    public static void main(String[] args) {

    }
}
