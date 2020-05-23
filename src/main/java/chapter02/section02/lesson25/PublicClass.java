package chapter02.section02.lesson25;

/**
 * @author: deng
 * @datetime: 2020/5/24 12:56 上午
 * @desc:
 */
public class PublicClass {
    static private String username;
    static private String password;

    static class PrivateClass {

        private String age;
        private String addr;

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getAddr() {
            return addr;
        }

        public void setAddr(String addr) {
            this.addr = addr;
        }

        public void printPublicProperty() {
            System.out.println("username = " + username + "\tpassword = " + password);
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
