package chapter05.section01.lesson5;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author: deng
 * @datetime: 2020/6/2 2:43 下午
 * @desc: 测试scheduleAtFixedRate方法任务不延时
 */
public class Run3 {
    public static Timer timer = new Timer();
    public static int runCount = 0;

    public static void main(String[] args) {
        MyTask1 myTask1 = new MyTask1();
        System.out.println("当前时间：" + LocalDateTime.now());
        Date planToDoTime = Date.from(LocalDateTime.now().plusSeconds(10).atZone(ZoneId.systemDefault()).toInstant());
        System.out.println("计划开始执行时间：" + planToDoTime);
        timer.scheduleAtFixedRate(myTask1, planToDoTime, 3000);
    }

    static public class MyTask1 extends TimerTask {
        @Override
        public void run() {
            try {
                System.out.println("MyTask1 begin:" + LocalDateTime.now());
                Thread.sleep(2000);
                System.out.println("MyTask1 end:" + LocalDateTime.now());
                runCount++;
                if (runCount == 5) {
                    timer.cancel();
                }
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }

        }
    }
}
