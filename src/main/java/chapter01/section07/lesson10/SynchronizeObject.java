package chapter01.section07.lesson10;

/**
 * @author: deng
 * @datetime: 2020/5/16 11:28 上午
 * @desc:
 */
public class SynchronizeObject {
    private String username = "a";
    private String password = "aaa";

    synchronized public void printString(String username, String password) {
        try {
            this.username = username;
            Thread.sleep(10000);
            this.password = password;
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
