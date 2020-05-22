package chapter02.section02.lesson4;

/**
 * @author: deng
 * @datetime: 2020/5/21 9:31 下午
 * @desc:
 */
public class ThreadB extends Thread{
    private Task task;

    public ThreadB(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        task.doLongTimeTask();
    }
}
