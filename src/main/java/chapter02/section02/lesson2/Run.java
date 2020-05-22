package chapter02.section02.lesson2;

/**
 * @author: deng
 * @datetime: 2020/5/21 7:53 下午
 * @desc: 使用synchronized同步代码块，同步了整个方法体没有起到优化作用
 */
public class Run {
    public static void main(String[] args) {
        ObjectService objectService = new ObjectService();
        ThreadA threadA = new ThreadA(objectService);
        threadA.setName("a");
        ThreadB threadB = new ThreadB(objectService);
        threadB.setName("b");
        threadA.start();
        threadB.start();
    }
}
