package chapter05.section01.lesson4;

import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author: deng
 * @datetime: 2020/6/2 12:21 下午
 * @desc: timer.schedule(myTask, 3000, 5000):3000毫秒后开始执行，开始执行后每隔5000毫秒执行
 * 从指定的延迟之后开始，为重复的固定延迟执行安排指定的任务。随后的执行大致按指定的周期间隔进行。
 */
public class Run {
    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        Timer timer = new Timer();
        System.out.println("当前时间：" + LocalDateTime.now());
        timer.schedule(myTask, 3000, 5000);
    }

    static public class MyTask extends TimerTask {

        @Override
        public void run() {
            System.out.println("运行时间：" + LocalDateTime.now());
        }
    }
}
