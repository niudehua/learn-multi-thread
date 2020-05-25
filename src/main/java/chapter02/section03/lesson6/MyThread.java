package chapter02.section03.lesson6;

/**
 * @author: deng
 * @datetime: 2020/5/24 11:09 下午
 * @desc:
 */
public class MyThread extends Thread{
    private MyService myService;

    public MyThread(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.addNum();
    }
}
