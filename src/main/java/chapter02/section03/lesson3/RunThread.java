package chapter02.section03.lesson3;

/**
 * @author: deng
 * @datetime: 2020/5/24 11:30 上午
 * @desc:
 */
public class RunThread extends Thread {
    volatile private boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public void run() {
        System.out.println("进入 run()");
        while (isRunning) {
        }
        System.out.println("线程停止了！");
    }
}
