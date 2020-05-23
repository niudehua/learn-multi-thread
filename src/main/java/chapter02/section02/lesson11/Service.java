package chapter02.section02.lesson11;

/**
 * @author: deng
 * @datetime: 2020/5/22 9:53 上午
 * @desc:
 */
public class Service {
    public MyOneList addServiceMethod(MyOneList list, String data) {
        try {
            synchronized (list) {
                if (list.getSize() < 1) {
                    Thread.sleep(2000);
                    list.add(data);
                }
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        return list;
    }
}
