package chapter05.section01.lesson1;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author: deng
 * @datetime: 2020/6/2 10:51 上午
 * @desc: 计划时间早于当前时间，提前运行效果
 */
public class Run3 {
    public static void main(String[] args) {
        LocalDateTime nowTime = LocalDateTime.now();
        System.out.println("当前时间：" + nowTime);
        Date planToDoTime = Date.from(nowTime.minusSeconds(10).atZone(ZoneId.systemDefault()).toInstant());
        System.out.println("计划执行时间：" + planToDoTime);
        MyTask myTask = new MyTask();
        Timer timer = new Timer(true);
        timer.schedule(myTask, planToDoTime);
    }

    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("任务运行时间：" + LocalDateTime.now());
        }
    }
}
