package chapter01.section02.lesson6;

/**
 * @author: deng
 * @datetime: 2020/5/15 2:26 下午
 * @desc:
 */
public class LoginService {
    private static String usernameref;
    private static String passwordref;

   synchronized public static void doPost(String username, String password) {
        usernameref = username;
        try {
            if (username.equals("a")) {
                Thread.sleep(5000);}
                passwordref = password;
                System.out.println("username=" + usernameref + "\npassword=" + password);

        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
