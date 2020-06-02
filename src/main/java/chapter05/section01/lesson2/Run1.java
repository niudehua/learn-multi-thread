package chapter05.section01.lesson2;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author: deng
 * @datetime: 2020/6/2 10:27 上午
 * @desc: schedule(TimeTask, Date, long)从指定的时间开始。随后的执行以固定的间隔进行，由指定的时间段隔开。
 * 计划时间晚于当前时间：在未来执行的效果
 */
public class Run1 {
    public static void main(String[] args) {
        System.out.println("当前时间为：" + LocalDateTime.now());
        Date runDate = Date.from(LocalDateTime.now().plusSeconds(10).atZone(ZoneId.systemDefault()).toInstant());
        System.out.println("计划开始执行时间为：" + runDate);
        MyTask task = new MyTask();
        Timer timer = new Timer();
        timer.schedule(task, runDate, 4000);
    }

    static public class MyTask extends TimerTask {

        @Override
        public void run() {
            System.out.println("运行时间为：" + LocalDateTime.now());
        }
    }
}
