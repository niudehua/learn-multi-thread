package chapter05.section01.lesson2;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author: deng
 * @datetime: 2020/6/2 10:36 上午
 * @desc: Time类的cancel()方法
 */
public class Run6 {
    static private int i = 0;

    public static void main(String[] args) {
        while (true) {
            i++;
            Timer timer = new Timer();
            MyTask myTask = new MyTask();
            timer.schedule(myTask, Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant()), 10000);
            timer.cancel();
        }
    }

    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("正常执行：" + i);
        }
    }

}
