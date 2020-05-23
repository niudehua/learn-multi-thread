package chapter02.section02.lesson11;

/**
 * @author: deng
 * @datetime: 2020/5/22 9:58 上午
 * @desc: 脏读
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyOneList myOneList = new MyOneList();
            ThreadA threadA = new ThreadA(myOneList);
            ThreadB threadB = new ThreadB(myOneList);
            threadA.setName("a");
            threadB.setName("b");
            threadA.start();
            threadB.start();
            Thread.sleep(6000);
            System.out.println(myOneList.getSize());
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
