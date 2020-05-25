package chapter02.section03.lesson5;

/**
 * @author: deng
 * @datetime: 2020/5/24 11:02 下午
 * @desc: 在操作i++时除了使用synchronized关键字实现同步外，还可以使用 AtomicInteger原子类的incrementAndGet()方法进行操作
 */
public class Run {
    public static void main(String[] args) {
        AddCountThread addCountThread = new AddCountThread();
        Thread thread1 = new Thread(addCountThread);
        thread1.start();
        Thread thread2 = new Thread(addCountThread);
        thread2.start();
        Thread thread3 = new Thread(addCountThread);
        thread3.start();
        Thread thread4 = new Thread(addCountThread);
        thread4.start();
        Thread thread5 = new Thread(addCountThread);
        thread5.start();

    }
}
