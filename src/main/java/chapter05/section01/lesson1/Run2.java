package chapter05.section01.lesson1;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author: deng
 * @datetime: 2020/6/2 10:51 上午
 * @desc: 将Timer设置为守护线程测试效果
 */
public class Run2 {
    public static void main(String[] args) {
        LocalDateTime nowTime = LocalDateTime.now();
        System.out.println("当前时间：" + nowTime);
        Date planToDoTime = Date.from(nowTime.plusSeconds(10).atZone(ZoneId.systemDefault()).toInstant());
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
