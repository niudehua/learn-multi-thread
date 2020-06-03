package chapter05.section01.lesson1;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author: deng
 * @datetime: 2020/6/2 10:51 上午
 * @desc: 多个Task 延时推迟的测试
 */
public class Run5 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("当前时间为：" + now);
        Date runDate1 = Date.from(now.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println("A计划时间为：" + runDate1);

        Date runDate2 = Date.from(now.plusSeconds(10).atZone(ZoneId.systemDefault()).toInstant()
        );
        System.out.println("B计划时间为：" + runDate2);

        MyTaskA task1 = new MyTaskA();
        MyTaskB task2 = new MyTaskB();

        Timer timer = new Timer();
        timer.schedule(task1, runDate1);
        timer.schedule(task2, runDate2);
    }

    static public class MyTaskA extends TimerTask {
        @Override
        public void run() {
            System.out.println("任务运行时间：" + LocalDateTime.now());
        }
    }

    static public class MyTaskB extends TimerTask {
        @Override
        public void run() {
            System.out.println("任务运行时间：" + LocalDateTime.now());
        }
    }
}
