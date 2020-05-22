package chapter02.section02.lesson1;

/**
 * @author: deng
 * @datetime: 2020/5/21 5:24 下午
 * @desc: synchronized()方法的弊端
 */
public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        ThreadA threadA = new ThreadA(task);
        ThreadB threadB = new ThreadB(task);
        threadA.start();
        threadB.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

        long beginTime = CommonUtils.beginTime1;
        if (CommonUtils.beginTime1 > CommonUtils.beginTime2) {
            beginTime = CommonUtils.beginTime2;
        }
        long endTime = CommonUtils.endTime2;
        if (CommonUtils.endTime1 > CommonUtils.endTime2) {
            endTime = CommonUtils.endTime1;
        }

        System.out.println("消耗时间" + (endTime - beginTime));
    }
}
