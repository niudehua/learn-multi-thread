package chapter05.section01.lesson2;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author: deng
 * @datetime: 2020/6/2 10:36 上午
 * @desc: TaskTime类的cancel()方法
 */
public class Run4 {
    public static void main(String[] args) {
        System.out.println("当前时间为：" + LocalDateTime.now());
        Date planToDoTime = Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
        System.out.println("计划开始执行时间" + planToDoTime);
        MyTaskA myTaskA = new MyTaskA();
        MyTaskB myTaskB = new MyTaskB();
        Timer timer = new Timer();
        timer.schedule(myTaskA, planToDoTime, 4000);
        timer.schedule(myTaskB, planToDoTime, 4000);
    }

    static public class MyTaskA extends TimerTask {
        @Override
        public void run() {
            System.out.println("TaskA运行时间：" + LocalDateTime.now());
            this.cancel();
            System.out.println("TaskA取消了" + LocalDateTime.now());
        }
    }

    static public class MyTaskB extends TimerTask {
        @Override
        public void run() {
            System.out.println("TaskB运行时间：" + LocalDateTime.now());
        }
    }
}
