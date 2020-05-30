package chapter03.section01.lesson19;

/**
 * @author: deng
 * @datetime: 2020/5/29 5:17 下午
 * @desc:
 */
public class ThreadA extends Thread{
    private DBTools dbTools;

    public ThreadA(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupA();
    }
}
