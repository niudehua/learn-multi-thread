package chapter05.section01.lesson1;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author: deng
 * @datetime: 2020/6/2 10:51 上午
 * @desc: 多个TimeTask任务测试
 */
public class Run4 {
    public static void main(String[] args) {
        LocalDateTime nowTime = LocalDateTime.now();
        System.out.println("当前时间为：" + nowTime);
        MyTask task1 = new MyTask();
        MyTask task2 = new MyTask();
        Date runDate1 = Date.from(nowTime.plusSeconds(10).atZone(ZoneId.systemDefault()).toInstant());
        System.out.println("task1计划时间为：" + runDate1);
        Date runDate2 = Date.from(nowTime.plusSeconds(20).atZone(ZoneId.systemDefault()).toInstant());
        System.out.println("task2计划时间为：" + runDate2);
        Timer timer = new Timer();
        timer.schedule(task1, runDate1);
        timer.schedule(task2, runDate2);
    }

    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("任务运行时间：" + LocalDateTime.now());
        }
    }
}
