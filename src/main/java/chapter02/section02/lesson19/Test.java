package chapter02.section02.lesson19;

/**
 * @author: deng
 * @datetime: 2020/5/23 11:33 下午
 * @desc: String 常量池缓存
 */
public class Test {
    public static void main(String[] args) {
        String a = "string";
        String b = "string";
        System.out.println(a == b);
    }
}
