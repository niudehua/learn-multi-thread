package chapter01.section07.lesson4;

/**
 * @author: deng
 * @datetime: 2020/5/15 5:43 下午
 * @desc:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            if (Thread.interrupted()) {
                System.out.println("已经是中断状态了，我要退出了！！！");
                break;
            }
            System.out.println("i=" + (i + 1));
        }
        System.out.println("嘿嘿😁！！你只中断了上面的for，我又回来了，线程并未真正中断哦！！");
    }
}
