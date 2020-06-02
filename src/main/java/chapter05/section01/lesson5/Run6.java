package chapter05.section01.lesson5;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author: deng
 * @datetime: 2020/6/2 2:43 下午
 * @desc: 测试scheduleAtFixedRate方法具备时间追赶性 :开始执行时把3分钟前的任务全追赶执行
 */
public class Run6 {
    public static Timer timer = new Timer();

    public static void main(String[] args) {
        MyTask1 myTask1 = new MyTask1();
        System.out.println("当前时间：" + LocalDateTime.now());
        Date planToDoTime = Date.from(LocalDateTime.now().minusMinutes(3).atZone(ZoneId.systemDefault()).toInstant());
        System.out.println("计划开始执行时间：" + planToDoTime);
        timer.scheduleAtFixedRate(myTask1, planToDoTime, 2000);
    }

    static public class MyTask1 extends TimerTask {
        @Override
        public void run() {
            System.out.println("MyTask1 begin：" + LocalDateTime.now());
            System.out.println("MyTask1 end：" + LocalDateTime.now());
        }
    }
}
