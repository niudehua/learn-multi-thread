package chapter02.section02.lesson3;

/**
 * @author: deng
 * @datetime: 2020/5/21 5:17 下午
 * @desc:
 */
public class Task {
    private String getData1;
    private String getData2;

    public void doLongTimeTask() {
        try {
            System.out.println("begin task");
            Thread.sleep(3000);
            synchronized (this) {
                getData1 = "长时间处理任务后从远程返回值 1 " + Thread.currentThread().getName();
                getData2 = "长时间处理任务后从远程返回值 2 " + Thread.currentThread().getName();
            }
            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("end task");
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
