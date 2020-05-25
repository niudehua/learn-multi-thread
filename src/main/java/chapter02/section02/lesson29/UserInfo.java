package chapter02.section02.lesson29;

/**
 * @author: deng
 * @datetime: 2020/5/24 10:45 上午
 * @desc:
 */
public class UserInfo {
    private String username;
    private String password;

    public UserInfo() {
    }

    public UserInfo(String username, String password) {
        this.username = username;
        this.password = password;
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
