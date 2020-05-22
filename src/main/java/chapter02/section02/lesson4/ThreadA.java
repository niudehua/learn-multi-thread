package chapter02.section02.lesson4;

/**
 * @author: deng
 * @datetime: 2020/5/21 9:31 下午
 * @desc:
 */
public class ThreadA extends Thread{
    private Task task;

    public ThreadA(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        task.doLongTimeTask();
    }
}
