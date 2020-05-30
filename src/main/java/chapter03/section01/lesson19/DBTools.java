package chapter03.section01.lesson19;

/**
 * @author: deng
 * @datetime: 2020/5/29 5:13 下午
 * @desc: 等待/通知 交叉备份
 */
public class DBTools {
    volatile private boolean prevIsA = false;

    synchronized public void backupA() {
        try {
            while (prevIsA) {
                wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("★★★★★");
            }
            prevIsA = true;
            notifyAll();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    synchronized public void backupB() {
        try {
            while (!prevIsA) {
                wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("☆☆☆☆☆");
            }
            prevIsA = false;
            notifyAll();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
