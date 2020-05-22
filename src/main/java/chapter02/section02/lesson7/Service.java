package chapter02.section02.lesson7;

/**
 * @author: deng
 * @datetime: 2020/5/21 10:27 下午
 * @desc:
 */
public class Service {
    private String username;
    private String password;
    private final String synString = new String();

    public void setUsernameAndPassword(String usernameParam, String passwordParam) {
        try {
            synchronized (synString) {
                System.out.println("线程：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入同步块");
                this.username = usernameParam;
                Thread.sleep(3000);
                this.password = passwordParam;
                System.out.println("线程：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开同步块");
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
