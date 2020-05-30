package chapter03.section02.lesson3;

/**
 * @author: deng
 * @datetime: 2020/5/29 11:15 下午
 * @desc: join()方法和interrupt()方法如果彼此遇到，就会出现异常，但是进程按钮还是"红色"，说明ThreadA并未异常，还在正常运行。
 */
public class Run {

    public static void main(String[] args) {

        try {
            ThreadB b = new ThreadB();
            b.setName("bThread");
            b.start();

            Thread.sleep(500);

            ThreadC c = new ThreadC(b);
            c.setName("cThread");
            c.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
