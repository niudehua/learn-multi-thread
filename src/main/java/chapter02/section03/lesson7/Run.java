package chapter02.section03.lesson7;

/**
 * @author: deng
 * @datetime: 2020/5/24 11:29 下午
 * @desc:
 */
public class Run {
    public static void main(String[] args) {
        final Service service = new Service();
//        ThreadA threadA = new ThreadA(service);
//        ThreadB threadB = new ThreadB(service);
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                service.runMethod();
            }
        });
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                service.stopMethod();
            }
        });
        threadA.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println("已经发起停止命令了");
        threadB.start();
    }
}

