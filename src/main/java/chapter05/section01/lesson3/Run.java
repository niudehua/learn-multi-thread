package chapter05.section01.lesson3;

import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author: deng
 * @datetime: 2020/6/2 12:17 下午
 * @desc: schedule(MyTask, delay): 将指定的任务安排在指定的延迟之后执行。
 */
public class Run {
    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        Timer timer = new Timer();
        timer.schedule(myTask, 4000);
    }

    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("运行时间：" + LocalDateTime.now());
        }
    }

}
