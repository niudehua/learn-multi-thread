package chapter05.section01.lesson2;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author: deng
 * @datetime: 2020/6/2 10:36 上午
 * @desc: 任务执行时间被延时
 */
public class Run3 {
    public static void main(String[] args) {
        System.out.println("当前时间为：" + LocalDateTime.now());
        Date planToDoTime = Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
        System.out.println("计划开始执行时间" + planToDoTime);
        MyTask myTask = new MyTask();
        Timer timer = new Timer();
        timer.schedule(myTask, planToDoTime, 4000);
    }

    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            try {
                System.out.println("运行时间：" + LocalDateTime.now());
                Thread.sleep(5000);
                System.out.println("运行完了：" + LocalDateTime.now());
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }
}
