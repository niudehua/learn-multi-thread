package chapter01.section07.lesson2;

/**
 * @author: deng
 * @datetime: 2020/5/15 4:50 下午
 * @desc: interrupted()具有清除状态的功能
 */
public class Run2 {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println("是否中断1？：" + Thread.interrupted());
        System.out.println("是否中断2？：" + Thread.interrupted());
    }
}
