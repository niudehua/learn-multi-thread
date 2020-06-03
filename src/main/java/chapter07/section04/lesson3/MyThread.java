package chapter07.section04.lesson3;


import java.text.ParseException;
import java.util.Date;

/**
 * @author: deng
 * @datetime: 2020/6/3 5:14 下午
 * @desc:
 */
public class MyThread extends Thread {
    private String dateString;

    public MyThread(String dateString) {
        super();
        this.dateString = dateString;
    }

    @Override
    public void run() {
        try {
            Date dateRef = DateTools.getSimpleDateFormat("yyyy-MM-dd").parse(
                    dateString);
            String newDateString = DateTools.getSimpleDateFormat("yyyy-MM-dd")
                    .format(dateRef).toString();
            if (!newDateString.equals(dateString)) {
                System.out.println("ThreadName=" + this.getName()
                        + "报错了 日期字符串：" + dateString + " 转换成的日期为："
                        + newDateString);
            } else {
                System.out.println("ThreadName=" + this.getName() + "日期字符串：" + dateString + " 转换成的日期为：" + newDateString);

            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
