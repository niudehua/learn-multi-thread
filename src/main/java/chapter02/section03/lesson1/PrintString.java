package chapter02.section03.lesson1;

/**
 * @author: deng
 * @datetime: 2020/5/24 11:00 上午
 * @desc:
 */
public class PrintString {
    private boolean isContinuePrint = true;

    public boolean isContinuePrint() {
        return isContinuePrint;
    }

    public void setContinuePrint(boolean continuePrint) {
        isContinuePrint = continuePrint;
    }

    public void printStringMethod() {
        while (isContinuePrint) {
            System.out.println("run printStringMethod() ThreadName = " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }

    }
}
