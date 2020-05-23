package chapter02.section02.lesson11;

/**
 * @author: deng
 * @datetime: 2020/5/22 9:56 上午
 * @desc:
 */
public class ThreadA extends Thread {
    private MyOneList myOneList;

    public ThreadA(MyOneList myOneList) {
        this.myOneList = myOneList;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.addServiceMethod(myOneList, "A");
    }
}
