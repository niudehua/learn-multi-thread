package chapter02.section02.lesson1;

/**
 * @author: deng
 * @datetime: 2020/5/21 5:20 下午
 * @desc:
 */
public class ThreadB extends Thread {
    private Task task;

    public ThreadB(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        CommonUtils.beginTime2 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime2 = System.currentTimeMillis();
    }
}
